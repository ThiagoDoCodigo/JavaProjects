// Classe que gerencia a masmorra (a lista encadeada)
public class Masmorra {
    private SalaNode entrada; // Equivalente ao "head"

    public Masmorra() {
        this.entrada = null;
    }

    // --- MÉTODOS JÁ IMPLEMENTADOS ---

    // Adiciona uma nova sala no FINAL da masmorra
    public void adicionarSala(String tipo, int valor) {
        SalaNode novaSala = new SalaNode(tipo, valor);
        if (entrada == null) {
            entrada = novaSala;
        } else {
            SalaNode atual = entrada;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novaSala;
        }
    }

    // Percorre a masmorra e exibe os eventos de cada sala
    public void explorarMasmorra() {
        if (entrada == null) {
            System.out.println("A masmorra está vazia. O herói não tem para onde ir.");
            return;
        }
        System.out.println("--- O Herói entra na masmorra... ---");
        SalaNode atual = entrada;
        int passo = 1;
        while (atual != null) {
            System.out.print("Passo " + passo + ": ");
            switch (atual.tipo) {
                case "monstro":
                    System.out.println("Um " + atual.tipo + " feroz aparece! Causa " + atual.valor + " de dano.");
                    break;
                case "tesouro":
                    System.out.println("Você encontrou um " + atual.tipo + "! Ganhou " + atual.valor + " moedas de ouro.");
                    break;
                case "vazia":
                    System.out.println("Esta sala está " + atual.tipo + ". Um momento de paz.");
                    break;
                default:
                    System.out.println("Sala misteriosa...");
                    break;
            }
            atual = atual.proximo;
            passo++;
        }
        System.out.println("--- Fim da exploração. ---");
    }

    // --- DESAFIO: IMPLEMENTAR ESTES MÉTODOS ---

    /*
     * OBJETIVO 1: Anexar outra masmorra no final da masmorra atual.
     * A 'outraMasmorra' representa um novo caminho que se conecta ao final do caminho atual.
     * Após a fusão, a 'outraMasmorra' deve ficar vazia para evitar que o mesmo caminho
     * seja gerenciado por dois objetos diferentes.
     * Dica: Percorra a masmorra atual até o último nó e aponte o 'proximo' dele
     * para a entrada da 'outraMasmorra'. Não se esqueça de "esvaziar" a outra masmorra.
    */
    public void fundirMasmorras(Masmorra outraMasmorra) {
         if(this.entrada == null){
            this.entrada = outraMasmorra.entrada;
         }else{
            SalaNode ultimoNo = this.entrada;
            while(ultimoNo.proximo != null){
               ultimoNo = ultimoNo.proximo;
            }
            
            ultimoNo.proximo = outraMasmorra.entrada;
         }
         outraMasmorra.entrada = null;
    }

    /*
     * OBJETIVO 2: Inserir uma nova sala (um caminho secreto) após a primeira
     * ocorrência de uma sala de um tipo específico.
     * Ex: Inserir uma sala "tesouro" após a primeira sala "vazia" encontrada.
     * Dica: Percorra a lista até encontrar um nó com o tipo 'tipoSalaAnterior'.
     * Quando encontrar, crie a nova sala e ajuste as referências para inseri-la logo após.
    */
    public void inserirCaminhoSecreto(String tipoSalaAnterior, String novoTipo, int novoValor) {
        if(this.entrada == null){
            System.out.println("Caminho vazio!");
            return;
        }
        
        SalaNode cursor = this.entrada;
        while(cursor != null){
            if(cursor.tipo.equals(tipoSalaAnterior)){
               SalaNode novaSala = new SalaNode(novoTipo, novoValor);
               SalaNode next = cursor.proximo;
               cursor.proximo = novaSala;
               novaSala.proximo = next;
               return;
            }
            cursor = cursor.proximo;
        }
        System.out.println("Sala do tipo nao existe!");
        
    }

    /*
     * OBJETIVO 3 (BÔNUS): Percorrer a masmorra e remover todas as salas de monstro
     * cujo dano ('valor') seja maior que 'danoMaximo'.
     * Isso torna a masmorra mais segura para o herói.
     * Dica: Cuidado ao remover nós! Você precisará de uma referência para o nó 'anterior'.
     * Lembre-se de tratar os casos especiais:
     * - O monstro a ser removido é a entrada da masmorra.
     * - Existem monstros perigosos em sequência.
    */
    public void removerSalasPerigosas(int danoMaximo) {
        if(this.entrada == null){
        System.out.println("Caminho vazio!");
        return;
       }
   
       if(danoMaximo < 1){
           return;
       }
   
       // Remove monstros perigosos no início da lista
       while(this.entrada != null && this.entrada.tipo.equals("monstro") && this.entrada.valor > danoMaximo) {
           this.entrada = this.entrada.proximo;
       }
   
       SalaNode prev = this.entrada;
       if(prev == null) return; // Lista ficou vazia
   
       SalaNode cursor = prev.proximo;
   
       while(cursor != null){
           if(cursor.tipo.equals("monstro") && cursor.valor > danoMaximo){
               // Remove o nó perigoso
               prev.proximo = cursor.proximo;
               // NÃO avança prev, pois cursor foi removido
           } else {
               prev = cursor; // Avança prev apenas se não remover
           }
           cursor = cursor.proximo;
       }
    }

}
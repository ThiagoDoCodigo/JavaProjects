// Classe que gerencia a playlist
public class Playlist {
    private MusicaNode head; // Referência para o início da lista
    private MusicaNode musicaAtual; // Referência para a música que está "tocando"

    // Construtor: inicializa uma playlist vazia
    public Playlist() {
        this.head = null;
        this.musicaAtual = null;
    }

    // --- MÉTODOS JÁ IMPLEMENTADOS ---

    // Adiciona uma nova música no FINAL da playlist
    public void adicionarMusica(String titulo, String artista, int duracao) {
        MusicaNode novaMusica = new MusicaNode(titulo, artista, duracao);
        if (head == null) {
            head = novaMusica;
        } else {
            MusicaNode atual = head;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novaMusica;
        }
        System.out.println("Musica '" + titulo + "' adicionada.");
    }

    // Remove uma música da playlist pelo título
    public void removerMusica(String titulo) {
        if (head == null) {
            System.out.println("Playlist vazia, nada a remover.");
            return;
        }

        // Caso especial: o nó a ser removido é a cabeça da lista
        // Em Java, usamos .equals() para comparar strings
        if (head.titulo.equals(titulo)) {
            head = head.proximo;
            // O Garbage Collector do Java cuidará de limpar a memória do nó antigo
            System.out.println("Musica '" + titulo + "' removida.");
            return;
        }

        MusicaNode anterior = head;
        MusicaNode atual = head.proximo;
        while (atual != null && !atual.titulo.equals(titulo)) {
            anterior = atual;
            atual = atual.proximo;
        }

        if (atual == null) {
            System.out.println("Musica '" + titulo + "' nao encontrada na playlist.");
        } else {
            anterior.proximo = atual.proximo;
            System.out.println("Musica '" + titulo + "' removida.");
        }
    }

    // Exibe todas as músicas da playlist
    public void exibirPlaylist() {
        if (head == null) {
            System.out.println("A playlist esta vazia.");
            return;
        }
        System.out.println("--- MINHA PLAYLIST ---");
        MusicaNode atual = head;
        int index = 1;
        while (atual != null) {
            System.out.println(index++ + ". " + atual.titulo + " - " 
                               + atual.artista + " (" + atual.duracao / 60 + "m" 
                               + atual.duracao % 60 + "s)");
            atual = atual.proximo;
        }
        System.out.println("---------------------");
    }

    // --- DESAFIO: IMPLEMENTAR ESTES MÉTODOS ---

    /*
     * OBJETIVO 1: Simular a reprodução de músicas.
     * A primeira vez que for chamada, deve exibir a primeira música.
     * Nas chamadas seguintes, deve exibir a próxima música da lista.
     * Se chegar ao final da playlist, deve voltar para o início (comportamento de "repeat").
     * Dica: Use a referência 'musicaAtual'. Se ela for nula, comece do 'head'.
    */
    public void tocarProxima() {
        // SUA IMPLEMENTAÇÃO AQUI
        System.out.println("Funcionalidade 'tocarProxima' ainda nao implementada.");
    }

    /*
     * OBJETIVO 2: Reorganizar a playlist.
     * Encontrar a música com o 'titulo' fornecido e movê-la para a 'novaPosicao'.
     * As posições começam em 1. Ex: novaPosicao = 1 significa mover para o início.
     * Lembre-se de tratar os casos especiais:
     * - Mover o primeiro elemento.
     * - Mover para a primeira posição.
     * - Mover para a última posição.
     * - Posição inválida ou música não encontrada.
     * Dica: Você precisará de referências para o nó anterior ao que será movido
     * e para o nó anterior à nova posição.
    */
    public void moverMusica(String titulo, int novaPosicao) {
         if(this.head == null){
            System.out.println("A lista esta vazia!!");
            return;
         }
         if(novaPosicao < 1){
            System.out.println("O valor fornecido invalido!!");
            return;
         }
         
         //Primeiro vou retirar a musica da lista
         MusicaNode musicaEscolhida = this.head;
         MusicaNode musicaAnterior = null;
         int posAtual = 1;
         while(musicaEscolhida != null && !musicaEscolhida.titulo.equals(titulo)){
            musicaAnterior = musicaEscolhida;
            musicaEscolhida = musicaEscolhida.proximo;
            posAtual ++;
         }   
         
         //verificar se achei a musica
         if(musicaEscolhida == null){
            System.out.println("A musica " + titulo + " nao foi encontrada!!");
            return;
         }
         
         if(posAtual == novaPosicao){
            System.out.println("A musica " + titulo + " ja esta na posicao desejada!!");
            return;
         }
         
         if(musicaAnterior == null){
            //significa que a musica escolhida é o head
            this.head = this.head.proximo;
            System.out.println("A musica " + titulo + " foi removida do inicio!!");
         }else{
            musicaAnterior.proximo = musicaEscolhida.proximo;
            System.out.println("A musica " + titulo + " foi removida da posicao: " + posAtual);
         }
         
         //inserir no inicio
         if(novaPosicao == 1){
            musicaEscolhida.proximo = this.head;
            this.head = musicaEscolhida;
            System.out.println("A musica " + titulo + " foi adicionada do inicio com sucesso!!");
            return;
         }
         
         
         //agora irei achar a posicao para inserir
         MusicaNode atual = this.head;
         MusicaNode anterior = null;
         int contador = 1;
         while(atual != null && contador < novaPosicao){
            anterior = atual;
            atual = atual.proximo;
            contador ++;
         }
         
         if(atual == null){
            musicaEscolhida.proximo = atual;
            if(anterior != null){
               anterior.proximo = musicaEscolhida;
            }
            System.out.println("A musica " + titulo + " foi adicionada do final com sucesso!!");
         }else{
            musicaEscolhida.proximo = atual;
            if(anterior != null){
               anterior.proximo = musicaEscolhida;
            }
            System.out.println("A musica " + titulo + " foi adiconada da posicao: " + novaPosicao);
         }
    }

    /*
     * OBJETIVO 3 (BÔNUS): Inverter a ordem de toda a playlist.
     * O último elemento deve se tornar o primeiro, o penúltimo o segundo, e assim por diante.
     * Tente fazer isso "in-place", ou seja, sem criar uma nova lista,
     * apenas manipulando as referências 'proximo' dos nós existentes.
     * Dica: Você precisará de três referências: 'anterior', 'atual' e 'proximo'.
    */
    public void inverterPlaylist() {
        if(this.head == null || this.head.proximo == null){
            System.out.println("Lista vazia ou tem apenas um elemento!");
            return;
        }
        
        MusicaNode atual = this.head;
        MusicaNode anterior = null;
        MusicaNode proximo = null;
        while(atual != null){
           // Guarda o próximo nó antes de mudar a referência
           proximo = atual.proximo;
           // Inverte a referência do nó atual
           atual.proximo = anterior;
           // Avança os ponteiros
           anterior = atual;
           atual = proximo;
        }
        
        this.head = anterior;
    }
}
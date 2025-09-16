public class ListaPessoas{
   PessoaComNo cabeca;
   int tamanho;
   
   public void say(String txt){
      System.out.print(txt);
   }
   
   public void sayln(String txt){
      System.out.println(txt);
   }
   
   public void imprimirPessoas(){
      if(cabeca == null){
         sayln("A lista esta vazia!");
         return;
      }
      
      PessoaComNo atual = this.cabeca;
      while(atual != null){
         say(atual.nome + "," + atual.idade + "   =>   ");
         atual = atual.proximo;
      }
      say("Final!\n");
      
   }
   
   public void adicionarNoFinal(String nome, int idade){
      PessoaComNo novaPessoaComNo = new PessoaComNo(nome, idade);
      if(cabeca == null){
         this.cabeca = novaPessoaComNo;
         sayln(nome + " foi adicionado(a) no inicio da lista!");
         this.tamanho ++;
         return;
      }
      
      PessoaComNo atual = this.cabeca;
      while(atual.proximo != null){
         atual = atual.proximo;
      }    
      atual.proximo = novaPessoaComNo;
      this.tamanho ++;
      sayln(nome + " foi adicionado(a) com sucesso na posicao " + tamanho + "!");
   }
   
   public void adicionarNoInicio(String nome, int idade){
      PessoaComNo novaPessoaComNo = new PessoaComNo(nome, idade);
      if(cabeca == null){
         this.cabeca = novaPessoaComNo;
         sayln(nome + " foi adicionado(a) no inicio da lista!");
         this.tamanho ++;
         return;
      }
      PessoaComNo atual = this.cabeca;
      this.cabeca = novaPessoaComNo;
      this.cabeca.proximo = atual;
      sayln(nome + " foi adicionado(a) no inicio da lista!");
      this.tamanho ++;
   }
   
   public void removerPorNome(String nome){
      if(cabeca == null){
         sayln("A lista esta vazia!");
         return;
      }
      
      if(cabeca.nome.equals(nome)){
         PessoaComNo proximo = this.cabeca.proximo;
         this.cabeca = proximo;
         sayln(nome + " removido(a) com sucesso do primeira posicao!");
         this.tamanho --;        
         return;
      }
      
      PessoaComNo atual = this.cabeca;
      PessoaComNo anterior = null;
      while(atual != null && !atual.nome.equals(nome)){
         anterior = atual;
         atual = atual.proximo;
      }
      if(atual == null){
         sayln(nome + " nao foi encontrado!");
         return;
      }
      anterior.proximo = atual.proximo;
      sayln(nome + " removido(a) com sucesso!");
      this.tamanho --;
   }
   
   public void exibirTamanho(){
      if(cabeca == null){
         sayln("A lista esta vazia!");
         return;
      }
      sayln("Tamanho: " + this.tamanho);
   }
   
   public void pesquisarPorNome(String nome){
      if(cabeca == null){
         sayln("A lista esta vazia!");
         return;
      }
      PessoaComNo atual = this.cabeca;
      while(atual != null && !atual.nome.equals(nome)){
         atual = atual.proximo;
      }
      if(atual == null){
         sayln("Pessoa nao encontrada!");
         return;
      }
      sayln("Pessoa encontrada: ");
      sayln("Nome: " + atual.nome);
      sayln("Idade: " + atual.idade);
   }
   
   public void inserirPorIndice(int indice, String nome, int idade){
      PessoaComNo novaPessoaComNo = new PessoaComNo(nome, idade);
      if(cabeca == null && indice == 1){
         this.cabeca = novaPessoaComNo;
         this.tamanho ++;
         sayln(nome + " foi adicionado(a) no inicio da lista!");
         return;
      }
      
      if(cabeca != null && indice == 1){
         PessoaComNo atual = this.cabeca;
         this.cabeca = novaPessoaComNo;
         this.cabeca.proximo = atual;
         this.tamanho ++;
         sayln(nome + " foi adicionado(a) no inicio da lista!");
         return;
      }
      
      PessoaComNo atual = this.cabeca;
      PessoaComNo anterior = null;
      int contador = 1;
      while(atual != null && contador < indice){
         anterior = atual;
         atual = atual.proximo;
         contador ++;
      }
      if(atual == null){
         sayln(nome + " foi adicionado(a) no final da lista (posicao maior que tamanho)!");
         anterior.proximo = novaPessoaComNo;
         tamanho ++;
         return;
      }
      anterior.proximo = novaPessoaComNo;
      novaPessoaComNo.proximo = atual;
      tamanho ++;
      sayln(nome + " foi adicionado(a) na posicao " + indice + "!");
   }
   
   public void apagarLista(){
      if(cabeca == null){
         sayln("A lista ja esta vazia!");
         return;
      }
      PessoaComNo atual = cabeca;
      while(atual != null) {
         PessoaComNo proximo = atual.proximo;
         atual.proximo = null;
         atual = proximo;
      }
      this.cabeca = null;
      this.tamanho = 0;
      sayln("A lista apagada!");
   }
   
   public void ordenarPorIdade() {
      if (cabeca == null || cabeca.proximo == null) {
        sayln("Lista já está ordenada ou vazia.");
        return;
      }
      boolean trocado;
      do{
         trocado = false;
         PessoaComNo atual = this.cabeca;
         while(atual.proximo != null){
            if(atual.idade > atual.proximo.idade){
               int tempIdade = atual.idade;
               String tempNome = atual.nome;
               
               atual.nome = atual.proximo.nome;
               atual.idade = atual.proximo.idade;
               
               atual.proximo.nome = tempNome;
               atual.proximo.idade = tempIdade;
               
               trocado = true;
            }
            atual = atual.proximo;
         }
      }while(trocado);
      sayln("Lista ordenada por idade!");    
   }
   
   
}
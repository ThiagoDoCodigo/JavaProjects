public class ListaPessoas{
   PessoaComNo inicio;
   PessoaComNo fim;
   
   public void say(String txt){
      System.out.print(txt);
   }
   
   public void sayln(String txt){
      System.out.println(txt);
   }
   
   public void inserirInicio(String nome) {
       PessoaComNo novaPessoa = new PessoaComNo(nome);

       if (this.inicio == null) {
           this.inicio = novaPessoa;
           this.fim = novaPessoa;
           sayln("A lista estava vazia, novo no inserido no inicio e fim!");
       } else {
           novaPessoa.proximo = this.inicio;
           this.inicio.anterior = novaPessoa;
           this.inicio = novaPessoa;
           sayln("Novo no inserido no inicio!");
       }
   }
   
   public void inserirFim(String nome){
      PessoaComNo novaPessoa = new PessoaComNo(nome);
      if (this.inicio == null) {
           this.inicio = novaPessoa;
           this.fim = novaPessoa;
           sayln("A lista estava vazia, novo no inserido no inicio e fim!");
       } else {
           novaPessoa.anterior = this.fim;
           this.fim.proximo = novaPessoa;
           this.fim = novaPessoa;
           sayln("Novo no inserido no final!");
       }
   }
   
   public void inserirComPosicao(String nome, int pos){
      PessoaComNo novaPessoa = new PessoaComNo(nome);
      
      if(pos < 1){
         sayln("Posicao invalida!");
         return;
      }
      
      if(pos == 1){
         novaPessoa.proximo = this.inicio;
         this.inicio.anterior = novaPessoa;
         this.inicio = novaPessoa;
         sayln("Novo no inserido no inicio!");
         return;
      }
      
      PessoaComNo atual = this.inicio;
      int contador = 1;
      PessoaComNo proximo = null;
      PessoaComNo anterior = null;
      while(atual != null && contador < pos){
         anterior = atual;
         atual = atual.proximo;
         proximo = atual;
         contador ++;
      }
      
      if(atual == null && (contador + 1) < pos){
         sayln("A posicao enviada e maior que a lista!");
         return;
      }
      
      if(atual == null){
         novaPessoa.anterior = this.fim;
         this.fim.proximo = novaPessoa;
         this.fim = novaPessoa;
         sayln("Novo no inserido no final!");
         return;
      }
      
        
      novaPessoa.proximo = proximo;
      novaPessoa.anterior = anterior;
      anterior.proximo = novaPessoa;
      proximo.anterior = novaPessoa;
      sayln("Novo no inserido na posicao: " + pos);
   }
   
}
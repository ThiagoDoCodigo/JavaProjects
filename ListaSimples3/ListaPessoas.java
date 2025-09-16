public class ListaPessoas{
   PessoaComNo cabeca;
   int tamanho;
   
   public void say(String txt){
      System.out.print(txt);
   }
   
   public void sayln(String txt){
      System.out.println(txt);
   }
   
   public void adicionarNoFinal(String nome, int idade){
      PessoaComNo novaPessoaComNo = new PessoaComNo(nome, idade);
      if(this.cabeca == null){
         this.cabeca = novaPessoaComNo;
         sayln(nome + " foi adicionada no inicio da lista");
         tamanho ++;
         return;
      }
      
      PessoaComNo atual = this.cabeca;
      while(atual.proximo != null){
         atual = atual.proximo;
      }
      atual.proximo = novaPessoaComNo;
   }
   
   public void adicionarNoInicio(String nome, int idade){
      PessoaComNo novaPessoaComNo = new PessoaComNo(nome, idade);
      if(this.cabeca == null){
         this.cabeca = novaPessoaComNo;
         sayln(nome + " foi adicionada no inicio da lista");
         tamanho ++;
         return;
      }
      PessoaComNo atual = this.cabeca;
      this.cabeca = novaPessoaComNo;
      this.cabeca.proximo = atual;
      tamanho ++;
      sayln(nome + " foi adicionada na posicao" + tamanho + " da lista");
   }
   
   public void apagarLista(){
      if(this.cabeca == null){
         sayln("A lista esta vazia!");
         return;
      }
      if(this.cabeca.proximo == null){
         sayln("A lista esta vazia!");
         this.cabeca = null;
         return;
      }
      
      PessoaComNo atual = this.cabeca;
      while(atual != null){
         PessoaComNo proximo = atual.proximo;
         atual.proximo = null;
         atual = proximo;
      }
      
      this.cabeca = null;
      this.tamanho = 0;
      
      sayln("A lista apagada!");
    }
    
    public void apagarPorNome(String nome){
      if(this.cabeca == null){
         sayln("A lista esta vazia!");
         return;
      }
      if(this.cabeca != null && this.cabeca.nome.equals(nome)){
         this.cabeca = cabeca.proximo;
         return;
      }
      
      PessoaComNo atual = cabeca;
      PessoaComNo anterior = null;
      while(atual != null && !atual.nome.equals(nome)){
         anterior = atual;
         atual = atual.proximo
      }
      
      if(atual == null){
         sayln("nao encontrei!");
         return;
      }
      anterior.proximo = atual.proximo;
    }
    
}
public class ListaPessoas{
   PessoaComNo cabeca;
   
   public ListaPessoas(){
      this.cabeca = null;
   }
   
   public void adicionar(String nome, int idade){
      PessoaComNo novaPessoa = new PessoaComNo(nome, idade);
      
      if(cabeca == null){
         cabeca = novaPessoa;
      }else{
         PessoaComNo atual = cabeca;
         while(atual.proximo != null){
            atual = atual.proximo;
         }
         atual.proximo = novaPessoa;
      }
   }
   
   
   public void imprimir(){
      PessoaComNo atual = cabeca;
      
      while(atual != null){
         System.out.println("Nome: " + atual.nome + " Idade: " + atual.idade);
         atual = atual.proximo;
      }
        System.out.println("Fim"); 
   }
   
}
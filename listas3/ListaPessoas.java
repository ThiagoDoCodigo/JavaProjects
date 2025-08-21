public class ListaPessoas{
   PessoaComNo cabeca;
   
   public ListaPessoas(){
      this.cabeca = null;
   }
   
   
   public void adicionar(String nome, int idade){
      PessoaComNo novaPessoa = new PessoaComNo(nome,idade);
      
      if(cabeca == null){
         cabeca = novaPessoa;
      }else{
         PessoaComNo atual = cabeca;
         while(atual.proximo !=  null){
            atual = atual.proximo;
         }
         atual.proximo = novaPessoa;
      }
   }
   
   public void remover(String nome){
      if(cabeca == null){
         System.out.println("Lista vazia, nada a remover!");
      }
      
      if(cabeca.nome == nome{
         cabeca = cabeca.proximo;
         System.out.println("Removida: " + nome);
      }
      
      PessoaComNo atual = cabeca;
      PessoaComNo anterior = null;
      
      
      while(atual != null && atual.nome != nome){
         anterior = atual;
         atual = atual.proximo;
      }
      
       if (atual == null) {
        System.out.println("Pessoa com nome '" + nome + "' não encontrada.");
    } else {
        anterior.proximo = atual.proximo;
        System.out.println("Pessoa removida com sucesso.");
    }
      
   }
   
   public void imprimir(){
      PessoaComNo atual = cabeca;
      while(atual != null){
         System.out.print("Nome: " + atual.nome + "  |  idade: " + atual.idade + "   =>   ");
         atual = atual.proximo;
      }
     System.out.print("The end!");
   }
}
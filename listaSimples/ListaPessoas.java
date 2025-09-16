public class ListaPessoas{
   PessoaComNo cabeca;
   int tamanho;
   
 
   public void imprimirLista(){
      PessoaComNo atual = cabeca;
      if(atual == null){
         System.out.println("A lista esta vazia!");
      }else{
         while(atual != null){
            System.out.print(atual.nome + "  =>  ");
            atual = atual.proximo;
         }
         System.out.println("Final");
      }
      
      
      
   }
 
   public void adicionarNoFinal(String nome){
      PessoaComNo novaPessoaComNo = new PessoaComNo(nome);
      
      if(cabeca == null){
         System.out.println(nome + " inserido(a) como primeiro da lista!");
         cabeca = novaPessoaComNo;
         tamanho ++;
      }else{
         PessoaComNo atual = cabeca;
         while(atual.proximo != null){
            atual = atual.proximo;
         }
         atual.proximo = novaPessoaComNo;
         tamanho ++;
         System.out.println(nome + " foi inserido(a) como " + tamanho + " da lista!");
      }
      
   }
   
   public void adicionarNoInicio(String nome){
      PessoaComNo novaPessoaComNo = new PessoaComNo(nome);
      
      if(cabeca == null){
         System.out.println(nome + " inserido(a) como primeiro da lista!");
         cabeca = novaPessoaComNo;
         tamanho ++;
      }else{
         System.out.println(nome + " inserido(a) como primeiro da lista!");
         PessoaComNo atualInicio = cabeca;
         cabeca = novaPessoaComNo;
         cabeca.proximo = atualInicio;
         tamanho++; 
      }
  
   }
   
   public void imprimirTamanho(){
      System.out.println("Tamanho: " + tamanho);
   }
   
   public void excluirPorNome(String nome){
      if(cabeca == null){
         System.out.println("Lista esta vazia!");
         return;
      }
      if (cabeca.nome.equals(nome)) {
        cabeca = cabeca.proximo;
        tamanho--;
        System.out.println(nome + " removido(a) com sucesso!");
        return;
      }
      
      PessoaComNo atual = cabeca;
      PessoaComNo anterior = null;
         
      while(atual != null && !atual.nome.equals(nome)){
         anterior = atual;
         atual = atual.proximo;         
      }
      if(atual == null){
         System.out.println("Pessoa nao encontrada!");
      }else{
         anterior.proximo = atual.proximo;
         System.out.println(nome + " removido(a) com sucesso!");
         tamanho --;
      }
      
   }
   
   public void removerCabeca(){
      if(cabeca == null){
         System.out.println("Lista esta vazia!");
         return;
      }
      if(cabeca.proximo == null){
         cabeca = null;
         System.out.println("Cabeca removida e agora a lista esta vazia!");
         return;
      }
      cabeca = cabeca.proximo;
      System.out.println("Cabeca removida!");
   }
   
}
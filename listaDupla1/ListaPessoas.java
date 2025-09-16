public class ListaPessoas{
   PessoaComNo cabeca;
   PessoaComNo cauda;
   int tamanho;

   public void adicionarNoFinal(String nome){
      PessoaComNo novaPessoa = new PessoaComNo(nome);
      
      if(this.cabeca == null){
         this.cabeca = novaPessoa;
         this.cauda = novaPessoa;
         System.out.println(nome + " adicionado(a) com sucesso!");
         
      }else{
         this.cauda.proximo = novaPessoa;
         novaPessoa.anterior = this.cauda;
         this.cauda = novaPessoa;
      }
      
      
      
   }

}
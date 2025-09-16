public class PessoaComNo{
   String nome;
   PessoaComNo proximo;
   
   public PessoaComNo(String nome){
      this.nome = nome;
      this.proximo = null;
   }
}
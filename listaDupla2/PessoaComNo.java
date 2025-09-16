public class PessoaComNo{
   String nome;
   PessoasComNo proximo;
   PessoaComNo anterior;
   
   public PessoaComNo(String nome){
      this.nome = nome;
      this.proximo = null;
      this.anterior = null;
   }
}
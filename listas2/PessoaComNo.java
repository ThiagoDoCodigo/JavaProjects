public class PessoaComNo{
   //Aqui estou declarando o esqueleto de como o objeto PessoaComNo será
   String nome;
   int idade;
   //Aqui estou declarando uma variavel igual a propria classe dela, que vai guardar qual o proximo obejto da lista
   PessoaComNo proximo;
   
   //Construtor, igual em todas classes
   public PessoaComNo(String nome, int idade){
      this.nome = nome;
      this.idade = idade;
      this.proximo = null;
   }
}
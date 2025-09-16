package entidades;

public class Pessoa{
   private String nome;
   private int idade;
      
      
   public void sayln(String txt){
      System.out.println(txt);
   }
      
   public Pessoa(String nome, int idade){
      this.nome = nome;
      this.idade = idade;   
   }
   
   
   public String getNome(){
      return this.nome;
   }
   
   public void setNome(String nome){
      this.nome = nome;
      sayln("Nome alterado com sucesso!");
   }
   
   public int getIdade(){
      return this.idade;
   }
   
   public void setIdade(int idade){
      this.idade = idade;
      sayln("Idade alterada com sucesso!");
   }
   
   public void exibirPessoa(){
      sayln("Nome: " + this.nome +"\nIdade: " + this.idade);
   }
   
}
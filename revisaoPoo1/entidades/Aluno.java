package entidades;

public class Aluno extends Pessoa{
   private double mediaGeral;
   
   public Aluno(String nome, int idade, double mediaGeral){
      super(nome, idade);
      this.mediaGeral = mediaGeral;
      sayln("Aluno cadastrado com sucesso!");
   }
   
   public double getMediaGeral(){
      return this.mediaGeral;
   }
   
   public void setMediaGeral(double mediaGeral){
      this.mediaGeral = mediaGeral;
      sayln("Media alterada com sucesso!");
   }
      
   @Override
   public void exibirPessoa(){
      super.exibirPessoa();
      sayln("Media: " + this.mediaGeral);
   }
}
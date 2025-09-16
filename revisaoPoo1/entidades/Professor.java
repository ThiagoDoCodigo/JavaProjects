package entidades;

public class Professor extends Pessoa{
   private double salario;
   
   
   public Professor(String nome, int idade, double salario){
      super(nome, idade);
      this.salario = salario;
      sayln("Professor cadastrado com sucesso!");
   }
   
   public double getSalario(){
      return this.salario;
   }
   
   public void setSalario(double salario){
      this.salario = salario;
      sayln("Salario alterado com sucesso!");
   }
   
   @Override
   public void exibirPessoa(){
      super.exibirPessoa();
      sayln("Salario: " + salario);
   }
}
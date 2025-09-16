package entidades;

public class Funcionario{
   private String nome;
   private double salario;
   
   public void sayln(String txt){
      System.out.println(txt);
   }
   
   public Funcionario(String nome, double salario){
      this.nome = nome;
      setSalario(salario);
      sayln("Funcionario cadastrado com sucesso!");
   }
   
   public String getNome(){
      return this.nome;
   }
   
   public void setNome(String nome){
      this.nome = nome;
      sayln("Nome alterado com sucesso!");
   }
   
   public double getSalario(){
      return this.salario;
   }
   
   public void setSalario(double salario){
      if(salario >= 0){
         this.salario = salario;
         sayln("Salario alterado com sucesso!");
      } else {
         sayln("Salario invalido!");
      }   
   }
   
   public String imprimirDados() {
        return "Nome: " + nome + "\nSalario: " + salario;
   }
   
}
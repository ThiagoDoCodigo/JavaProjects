public class Funcionario{
   String nome;
   double salario;
   double imposto;
   
   public Funcionario(String nome, double salario, double imposto){
      this.nome = nome;
      this.salario = salario;
      this.imposto = imposto;
   }
   
   public void imprimir(){
      System.out.println("\n======================================\n");
      System.out.println("Nome: " + nome);
      System.out.println("\n======================================\n");
      System.out.printf("Salario bruto: %.2f\n", salario);
      System.out.println("\n======================================\n");
      System.out.printf("Imposto: %.2f%%\n", imposto);
      System.out.println("\n======================================\n");
      double aliquota = salario * (imposto / 100);
      double salarioLiquido = salario - aliquota;
      System.out.printf("Salario liquido: %.2f\n", salarioLiquido);
      System.out.println("\n======================================\n");
   }
   
   public void imprimirComAumento(double aumento){
      System.out.println("\n======================================\n");
      System.out.println("Nome: " + nome);
      System.out.println("\n======================================\n");
      double aumentoValue = salario * (aumento / 100);
      double salarioComAumento = salario + aumentoValue;
      System.out.printf("Salario bruto com aumento: %.2f\n", salarioComAumento);
      System.out.println("\n======================================\n");
      System.out.printf("Valor do aumento: %.2f\n", aumentoValue);
      System.out.println("\n======================================\n");
      System.out.printf("Imposto: %.2f%%\n", imposto);
      System.out.println("\n======================================\n");
      double aliquota = salarioComAumento * (imposto / 100);
      double salarioLiquido = salarioComAumento - aliquota;
      System.out.printf("Salario liquido com aumento: %.2f\n", salarioLiquido);
      System.out.println("\n======================================\n");
   }    
}
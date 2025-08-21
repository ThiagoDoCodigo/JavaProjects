import java.util.Scanner;
import java.util.Locale;

public class Main{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      sc.useLocale(Locale.US); 
      System.out.print("Digite o nome do funcionario: ");
      String nome = sc.nextLine();
      
      System.out.println("\n======================================\n");
      
      System.out.print("Digite o salario do funcionario: ");
      double salario = sc.nextDouble();
      
      System.out.println("\n======================================\n");
      
      System.out.print("Digite o imposto sobre o salario: ");
      double imposto = sc.nextDouble();
      
      Funcionario func = new Funcionario(nome, salario, imposto);
      
      func.imprimir();
      
      System.out.print("Digite o aumento desejado para o funcionario do mes: ");
      double aumento = sc.nextDouble();
      
      func.imprimirComAumento(aumento);
      
      sc.close();
   }
}
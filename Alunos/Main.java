import java.util.Scanner;
import java.util.Locale;

public class Main{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      sc.useLocale(Locale.US); 
      
      System.out.print("Digite o nome do aluno: ");
      String nome = sc.nextLine();
      
      System.out.println("\n========================================\n");
      
      System.out.print("Digite a primeira nota do aluno: ");
      double nota1 = sc.nextDouble();
      
      System.out.println("\n========================================\n");
      
      System.out.print("Digite a segunda nota do aluno: ");
      double nota2 = sc.nextDouble();
      
      System.out.println("\n========================================\n");
      
      System.out.print("Digite a terceira nota do aluno: ");
      double nota3 = sc.nextDouble();
      
      Aluno aluno = new Aluno(nome, nota1, nota2, nota3);
      
      aluno.imprimirResultado();
      
      sc.close();
   }
}
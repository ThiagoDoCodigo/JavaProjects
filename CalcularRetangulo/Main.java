import java.util.Scanner;

public class Main{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
     
      
      System.out.print("Digite a altura do retangulo(cm): ");
      double altura = sc.nextDouble();
      
      System.out.print("Digite a largura do retangulo(cm): ");
      double largura = sc.nextDouble();
      Retangulo obj = new Retangulo(largura, altura);
      obj.imprimirValoresRetangulo();
      
      sc.close();
      
   }
}
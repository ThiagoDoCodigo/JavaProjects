import java.util.Scanner;

public class Main{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Digite o nome do produto: ");
      String nome = sc.nextLine();
      
      System.out.print("Digite a quantidade inicial em estoque: ");
      int qtd = sc.nextInt();
      
      System.out.print("Digite o preco de venda do produto: ");
      double price = sc.nextDouble();
      
      Produto novoProduto = new Produto(nome, qtd, price);
      
    
      
      System.out.println("==============================================");
      System.out.println("Nome: " + novoProduto.getNome());
      System.out.println("Quantida: " + novoProduto.getQtd());
      System.out.printf("Preco: R$ %.2f\n", novoProduto.getPrice());
      System.out.printf("Valor em estoque: R$ %.2f\n", novoProduto.getPrice()*novoProduto.getQtd());
      System.out.println("==============================================\n");
      
      System.out.println("==============================================");
      System.out.print("Digite a quantidade de entradas: ");
      int entrada = sc.nextInt();
      if(entrada < 1){
         System.out.println("Entrada invalida!");
      }else{
         novoProduto.setQtd(novoProduto.getQtd() + entrada);
         System.out.println("Entrada realizada com sucesso!");
      }    
      System.out.println("==============================================\n");
      
      
      System.out.println("==============================================");
      System.out.print("Digite a quantidade de saidas: ");
      int saida = sc.nextInt();
      if(saida < 1){
         System.out.println("saida invalida!");
      }else{
         if(novoProduto.getQtd() > saida){
            novoProduto.setQtd(novoProduto.getQtd() - saida);
            System.out.println("saida realizada com sucesso!");
         }else{
            System.out.println("Quantida maior que o estoque! Tem algo errado ai!!");
         }
         
      }    
      System.out.println("==============================================\n");
      
      System.out.println("==============================================");
      System.out.println("Nome: " + novoProduto.getNome());
      System.out.println("Quantida: " + novoProduto.getQtd());
      System.out.printf("Preco: R$ %.2f\n", novoProduto.getPrice());
      System.out.printf("Valor em estoque: R$ %.2f\n", novoProduto.getPrice()*novoProduto.getQtd());
      System.out.println("==============================================\n");
      
      sc.close();
   }
}
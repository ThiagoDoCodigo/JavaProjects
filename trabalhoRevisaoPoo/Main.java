//Thiago Ferreira Goncalves

public class Main{
   public static void main(String[] args){
      Product product1 = new Product("12345678", "Arroz sepe", 12.50);
      Product product2 = new Product("", "Feijao", 8.75);
      
      
      System.out.println("====================================================================");
      System.out.println("Produtos garais:");
      System.out.println(product1.getInfo());
      System.out.println();
      System.out.println(product2.getInfo());
      System.out.println("====================================================================");
      
      
      PerishableProduct perishableProduct1 = new PerishableProduct("1234567890123", "Leite", 5.50, "10/10/2025", 5.0);
      PerishableProduct perishableProduct2 = new PerishableProduct(null, "Iogurte", 3.25, "12/10/2025", 4.0); 
      
      System.out.println("====================================================================");
      System.out.println("\nProdutos Pereciveis:");
      System.out.println(perishableProduct1.getInfo());
      System.out.println();
      System.out.println(perishableProduct2.getInfo());
      System.out.println("====================================================================");
   }
}

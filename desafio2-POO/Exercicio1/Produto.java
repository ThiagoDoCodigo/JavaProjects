public class Produto{
   private String nome;
   private int qtd;
   private double price;
   
   public Produto(String nome, int qtd, double price){
      this.nome = nome;
      this.qtd = qtd;
      this.price = price;
      System.out.println("Produto cadastrado com sucesso!");   
   }
   
   public void setNome(String nome){
      this.nome = nome;
   }
   public void setQtd(int qtd){
      this.qtd = qtd;
   }
   public void setPrice(double price){
      this.price = price;
   }
   
   public String getNome(){
      return this.nome;
   }
   public int getQtd(){
      return this.qtd;
   }
   public double getPrice(){
      return this.price;
   }
}
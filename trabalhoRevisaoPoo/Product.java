//Thiago Ferreira Goncalves

public class Product {
   private String cEAN;
   private String name;
   private double price;
   
   public Product() {
      this.cEAN = "SEM GTIN";
      this.name = "Padrao";
      this.price = 0.0;
   }
   
   public Product(String cEAN, String name, double price) {
      if (cEAN == null || cEAN.isBlank()) {
         this.cEAN = "SEM GTIN";
      } else if (cEAN.length() != 8 && cEAN.length() != 12 && cEAN.length() != 13 && cEAN.length() != 14) {
         System.out.println("Codigo invalido, usando SEM GTIN");
         this.cEAN = "SEM GTIN";
       } else {
         this.cEAN = cEAN;
       }

       if (name == null || name.isBlank()) {
         throw new IllegalArgumentException("Nome invalido");
       }
       if (price < 0) {
         throw new IllegalArgumentException("Preço invalido");
       }

       this.name = name;
       this.price = price;
   }

   public String getCEAN() {
      return this.cEAN;
   }

   public void setCEAN(String cEAN) {
      if (cEAN == null || cEAN.isBlank()) {
         this.cEAN = "SEM GTIN";
       } else if (cEAN.length() != 8 && cEAN.length() != 12 && cEAN.length() != 13 && cEAN.length() != 14) {
         System.out.println("Codigo invalido, usando SEM GTIN");
         this.cEAN = "SEM GTIN";
       } else {
         this.cEAN = cEAN;
       }
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      if (name == null || name.isBlank()) {
         throw new IllegalArgumentException("Nome invalido");
       }
       this.name = name;
   }

   public double getPrice() {
      return this.price;
   }

   public void setPrice(double price) {
      if (price < 0) {
         throw new IllegalArgumentException("Preço invalido");
      }
      this.price = price;
   }

   public double getPriceWithDiscount() {
      return this.price * 0.9;
   }
   
   public double getPriceDiscount() {
      return this.price * 0.1;
   }

   public String getInfo() {
      StringBuilder info = new StringBuilder();
      info.append("Codigo: ").append(this.cEAN).append("\n");
      info.append("Nome: ").append(this.name).append("\n");
      info.append("Preco: R$ ").append(String.format("%.2f", this.price)).append("\n");
      info.append("Desconto: R$ ").append(String.format("%.2f", this.getPriceDiscount())).append("\n");
      info.append("Preco com desconto: R$ ").append(String.format("%.2f", this.getPriceWithDiscount()));
      return info.toString();
   }
}
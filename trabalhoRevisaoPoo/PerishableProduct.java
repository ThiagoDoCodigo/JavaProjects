//Thiago Ferreira Goncalves

public class PerishableProduct extends Product {
   private String validityDate;
   private double storageTemperature;
   
   public PerishableProduct() {
      super("SEM GTIN", "Padrao perecivel", 0.0);
      this.validityDate = "01/01/2000";
      this.storageTemperature = 0.0;
   }
   
   public PerishableProduct(String cEAN, String name, double price, String validityDate, double storageTemperature) {
      super(cEAN, name, price);
     
      if (validityDate == null || validityDate.isBlank()) {
         throw new IllegalArgumentException("Data de validade invalida");
      }
   
      if (storageTemperature < -50 || storageTemperature > 100) {
         throw new IllegalArgumentException("Temperatura de armazenamento invalida");
      }

      this.validityDate = validityDate;
      this.storageTemperature = storageTemperature;
   }

   public String getValidityDate() {
      return this.validityDate;
   }

   public void setValidityDate(String validityDate) {
      if (validityDate == null || validityDate.isBlank()) {
         throw new IllegalArgumentException("Data de validade invalida");
       }
       this.validityDate = validityDate;
   }

   public double getStorageTemperature() {
      return this.storageTemperature;
   }

   public void setStorageTemperature(double storageTemperature) {
      if (storageTemperature < -50 || storageTemperature > 100) {
         throw new IllegalArgumentException("Temperatura de armazenamento invalida");
       }
       this.storageTemperature = storageTemperature;
   }

   @Override
   public double getPriceWithDiscount() {
      return this.getPrice() * 0.8;
   }
   
   @Override
   public double getPriceDiscount() {
      return this.getPrice() * 0.2;
   }

   @Override
   public String getInfo() {
      StringBuilder info = new StringBuilder();
      info.append(super.getInfo()).append("\n");
      info.append("Validade: ").append(this.validityDate).append("\n");
      info.append("Temperatura de armazenamento: ")
       .append(String.format("%.1f", this.storageTemperature)).append(" Graus");
      return info.toString();
   }  
}
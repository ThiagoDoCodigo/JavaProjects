package entidades;

public class Veiculo{
   private String placa;
   private double maxCarga;
   
   public void sayln(String txt){
      System.out.println(txt);
   }
   
   public Veiculo(String placa, double maxCarga){
      this.placa = placa;
      this.maxCarga = maxCarga;
      sayln("Veiculo cadastrado com sucesso!");
   }
   
   public String getPlaca(){
      if(this.placa == null || this.placa.equals("")){
         sayln("O campo placa encontra-se vazio!");
         return ""; 
      }
      return this.placa;
   }
   
   public void setPlaca(String placa){
      this.placa = placa;
      sayln("Placa alterada com sucesso!");
   }
   
   public double getMaxCarga(){
      if(this.maxCarga <= 0){
         sayln("O campo carga maxima encontra-se vazio!");
         return 0.00;
      }
      return this.maxCarga;
   }
   
   public void setMaxCarga(double maxCarga){
      this.maxCarga = maxCarga;
   }
   
   public void exibirInfsVeiculo(){
      sayln("Placa: " + this.placa);
      sayln("Carga maxima: " + this.maxCarga + "kg");
   }
}
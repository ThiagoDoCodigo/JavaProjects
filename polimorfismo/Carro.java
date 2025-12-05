public class Carro extends Veiculo implements Transporte{
   final double tx = 1.8;
   int portas;
   
   public Carro(String marca, String modelo, double km, int portas){
      super(marca, modelo, km);
      this.portas = portas;
   }
   
   public double calcularValor(double km, double tax){
      return km * tax;
   }
   
   @Override
   public String toString(){
      return this.modelo;
   }
}
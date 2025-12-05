public class Carro extends Veiculo implements Transporte{
   private int portas;
   private final double TX_FIXA = 2.5;
   
   public Carro(String marca, String modelo, String placa, double valorKm, String cor, int portas){
      super(marca, modelo, placa, valorKm, cor);
      this.portas = portas;
   }
   
   public double calcularCusto(double km){
      double valor = (this.getValorKm() * km) + this.TX_FIXA;
      return valor;
   }
   
   public String exibirDesc(){
      StringBuilder sb = new StringBuilder();
      sb.append("Informações do carro: \n");
      sb.append("Marca: ").append(getMarca()).append("\n");
      sb.append("Modelo: ").append(getModelo()).append("\n");
      sb.append("Placa: ").append(getPlaca()).append("\n");
      sb.append("Cor: ").append(getCor()).append("\n");
      sb.append("Numero de Portas: ").append(portas).append("\n");
      sb.append(String.format("Custo por Km: R$ %.2f\n", getValorKm()));
      sb.append(String.format("Taxa Fixa: R$ %.2f\n", this.TX_FIXA));
      return sb.toString();
   }
}
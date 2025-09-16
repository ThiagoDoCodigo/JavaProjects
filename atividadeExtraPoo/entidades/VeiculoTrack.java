package entidades;

public class VeiculoTrack extends Veiculo{
   private int qtdEixos;
   
   public VeiculoTrack(String placa, double maxCarga, int qtdEixos){
      super(placa, maxCarga);
      this.qtdEixos = qtdEixos;
   }
   
   public int getQtdEixos(){
      if(this.qtdEixos <= 0){
         sayln("O campo quantidade de eixos encontra-se vazio!");
         return 0;
      }
      return this.qtdEixos;
   }
   
   public void setQtdEixos(int qtdEixos){
      this.qtdEixos = qtdEixos;
      sayln("Quantidade de eixos atualizada com sucesso!");
   }
   
   @Override
   public void exibirInfsVeiculo(){
      super.exibirInfsVeiculo();
      sayln("Quantidade de eixos: " + qtdEixos);
   }
}
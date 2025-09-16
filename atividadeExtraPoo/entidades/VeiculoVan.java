package entidades;

public class VeiculoVan extends Veiculo{
   private int maxCaixas;
   
   public VeiculoVan(String placa, double maxCarga, int maxCaixas){
      super(placa, maxCarga);
      this.maxCaixas = maxCaixas;
   }
   public int getMaxCaixas(){
      if(this.maxCaixas <= 0){
         sayln("O campo quantidade de caixas encontra-se vazio!");
         return 0;
      }
      return this.maxCaixas;
   }
   
   public void setMaxCaixas(int maxCaixas){
      this.maxCaixas = maxCaixas;
      sayln("Quantidade maximas de caixas atualizado com sucesso!");
   }
   
   @Override
   public void exibirInfsVeiculo(){
      super.exibirInfsVeiculo();
      sayln("Quantidade maxima de caixas: " + maxCaixas);
   }
}
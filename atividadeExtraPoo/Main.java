import entidades.VeiculoTrack;
import entidades.VeiculoVan;

public class Main{
   public static void main(String[] args){
      VeiculoTrack newTrack = new VeiculoTrack("thg-4123", 2000, 4);
      VeiculoVan newVan = new VeiculoVan("eta-7425", 1200, 100);
      System.out.println("==============================================");

      newTrack.exibirInfsVeiculo();
      System.out.println("==============================================");
      newVan.exibirInfsVeiculo();
   }
}
public class ContabilizarCorrida{
   int numCorridas;
   double valorTotal;
   
   public void registrar(Transporte t, double km){
      double valor = t.calcularCusto(km);
      this.valorTotal = this.valorTotal + valor;
      this.numCorridas+=1;
   }
}
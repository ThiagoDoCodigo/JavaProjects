package entidades;

public class ContaPoupanca extends Conta  {
   private double taxaJuros;
   
   public ContaPoupanca(int numero, String titular, double taxaJuros){
      super(numero, titular);
      this.taxaJuros = taxaJuros;
   }
   
   public double getTaxaJuros() {
      return taxaJuros;
   }

   public void setTaxaJuros(double taxaJuros) {
      this.taxaJuros = taxaJuros;
      sayln("Taxa de juros alterada com sucesso!");
   }
   
   @Override
   public void sacar(double valorSaque){
      super.sacar(valorSaque);
    }
   
   @Override
   public void depositar(double valorDeposito){
      super.depositar(valorDeposito);
    }
   
   public void atualizarSaldo(){
      this.saldo += this.saldo * taxaJuros;
      sayln("Saldo atualizado com sucesso!");
   }
   
}
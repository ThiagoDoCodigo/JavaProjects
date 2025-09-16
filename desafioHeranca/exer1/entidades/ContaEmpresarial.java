package entidades;

public class ContaEmpresarial extends Conta {
   private double limiteEmprestimo;
   
   
   public ContaEmpresarial(int numero, String titular, double limiteEmprestimo){
      super(numero, titular);
      this.limiteEmprestimo = limiteEmprestimo;

   }
   
   public double getLimiteEmprestimo(){
      return this.limiteEmprestimo;
   }
   
   public void setLimiteEmprestimo(double limiteEmprestimo){
      this.limiteEmprestimo = limiteEmprestimo;
      sayln("Limite alterado com sucesso!");
   }
   
   @Override
   public void sacar(double valorSaque){
      super.sacar(valorSaque);
   }
   
   @Override
   public void depositar(double valorDeposito){
      super.depositar(valorDeposito);
   }
   
   public void emprestar(double valorEmprestimo){
      if(valorEmprestimo <= this.limiteEmprestimo && valorEmprestimo <= this.saldo){
         this.saldo -= valorEmprestimo; 
         sayln("Valor emprestado com sucesso!");   
      }else{
         sayln("Valor solicitado ultrapassou o limite!");
      }
   }
   
}
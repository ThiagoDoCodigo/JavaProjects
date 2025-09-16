package entidades;

public class Conta{
   private int numero;
   private String titular;
   protected double saldo;
   

   public void say(String txt){
      System.out.print(txt);
   }
   
   public void sayln(String txt){
      System.out.println(txt);
   }
   
   //Construtor padrão ao criar a conta
   public Conta(int numero, String titular){
      this.numero = numero;
      this.titular = titular;
      this.saldo = 0.00;
      sayln(titular + " foi cadastrado com sucesso!");
   }
   
   
   public int getNumero(){
      return this.numero;
   }
   
   public void setNumero(int numero){
      this.numero = numero;
      sayln("Numero do titular " + this.titular + " foi alterado com sucesso!");
   }
   
   public String getTitular(){
      return this.titular;
   }
   
   public void setTitular(String titular){
      this.titular = titular;
      sayln("Nome do titular alterado com sucesso!");
   }
   
   public double getSaldo(){
      return this.saldo;
   }
   
   public void setSaldo(double saldo){
      this.saldo = saldo;
      sayln("Saldo do titular " + this.titular + " foi alterado com sucesso!");
   }
   
   public void sacar(double valorSaque){
      if(valorSaque <= this.saldo){
         this.saldo -= valorSaque;
         sayln("Saque no valor de " + valorSaque + " realizado com sucesso!");  
      }else{
         sayln("Saque no valor de " + valorSaque + " negado! Valor maior que o saldo!");  
      }
   }
   
   
   public void depositar(double valorDeposito){
      this.saldo += valorDeposito;
      sayln("Deposito no valor de " + valorDeposito + " realizado com sucesso!"); 
   }
   
}
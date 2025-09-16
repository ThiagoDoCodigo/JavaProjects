package entidades;

public class FuncionarioPF extends Funcionario{
   private String cpf;
   
   //usei o chatGPT para criar essa validação
   private boolean validarCPF(String cpf){
      if(cpf == null) return false;
         cpf = cpf.replaceAll("\\D", ""); // remove não dígitos
         
      if(cpf.length() != 11) return false;

      // não pode ser sequência repetida
      if(cpf.matches("(\\d)\\1{10}")) return false;

      int[] numeros = new int[11];
      for(int i = 0; i < 11; i++){
         numeros[i] = Character.getNumericValue(cpf.charAt(i));
      }

      // calcula primeiro dígito verificador
      int soma = 0;
      for(int i = 0; i < 9; i++){
         soma += numeros[i] * (10 - i);
      }
      int dig1 = 11 - (soma % 11);
      if(dig1 >= 10) dig1 = 0;

      // calcula segundo dígito verificador
      soma = 0;
      for(int i = 0; i < 10; i++){
         soma += numeros[i] * (11 - i);
      }
      int dig2 = 11 - (soma % 11);
      if(dig2 >= 10) dig2 = 0;

      return dig1 == numeros[9] && dig2 == numeros[10];
    }
   
   public FuncionarioPF(String nome, double salario, String cpf){
      super(nome, salario);
      setCPF(cpf);
   }
   
   public String getCPF(){
      return this.cpf;
   }
   
   public void setCPF(String cpf) {
      if(validarCPF(cpf)){
         this.cpf = cpf;
         sayln("CPF alterado com sucesso!");
      } else {
         sayln("CPF invalido!");
      }
   }
   
   
   @Override
    public String imprimirDados() {
      return super.imprimirDados() + "\nCPF: " + cpf;
    }
}
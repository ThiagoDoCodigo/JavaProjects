package entidades;

public class FuncionarioPJ extends Funcionario{
   private String cnpj;
   
   //usei o chatGPT para criar essa validação
   private boolean validarCNPJ(String cnpj){
      if(cnpj == null) return false;
        cnpj = cnpj.replaceAll("\\D", "");
      if(cnpj.length() != 14) return false;

      if(cnpj.matches("(\\d)\\1{13}")) return false;

      int[] numeros = new int[14];
      for(int i = 0; i < 14; i++){
          numeros[i] = Character.getNumericValue(cnpj.charAt(i));
      }

        // primeiro dígito verificador
      int soma = 0;
      int[] pesos1 = {5,4,3,2,9,8,7,6,5,4,3,2};
      for(int i = 0; i < 12; i++){
          soma += numeros[i] * pesos1[i];
      }
      int dig1 = soma % 11;
      dig1 = (dig1 < 2) ? 0 : 11 - dig1;

      // segundo dígito verificador
      soma = 0;
      int[] pesos2 = {6,5,4,3,2,9,8,7,6,5,4,3,2};
      for(int i = 0; i < 13; i++){
          soma += numeros[i] * pesos2[i];
      }
      int dig2 = soma % 11;
      dig2 = (dig2 < 2) ? 0 : 11 - dig2;

      return dig1 == numeros[12] && dig2 == numeros[13];
    }
   
   public FuncionarioPJ(String nome, double salario, String cnpj){
      super(nome, salario);
      setCNPJ(cnpj);
   }
   
   public String getCNPJ(){
      return this.cnpj;
   }
   
   public void setCNPJ(String cnpj){
      if(validarCNPJ(cnpj)){
         this.cnpj = cnpj;
         sayln("CNPJ alterado com sucesso!");
      } else {
         sayln("CNPJ invalido!");
      }
   }
   
   @Override
    public String imprimirDados() {
      return super.imprimirDados() + "\nCNPJ: " + cnpj;
   }
}
import java.util.InputMismatchException;

public class Main{
   public static String sendError(Exception e){
      if(e instanceof ArrayIndexOutOfBoundsException){
         return "Os 2 vetores possuem tamanhos diferentes";
      }else if(e instanceof ArithmeticException){
         return "Java nao aceita divisao por 0";
      }else if(e instanceof InputMismatchException){
         return "Valor informado nao e numerico";
      }else{
         return "Erro desconhecido ou nao tratado";
      }
   }
   
   public static void main(String[] args){
      int[] n = {4, 8, 16, 32, 64, 128};
      int[] d = {2, 0, 4, 8, 0};
      
      for(int i = 0; i < n.length; i++){
         try{
            double divisao = n[i] / d[i];
            System.out.println("Divisao: " + divisao);
         }catch(Exception e){
            System.out.println(sendError(e));
         }
      }
   }
}
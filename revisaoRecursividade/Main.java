public class Main{

   public static int fatorial(int n){
      if(n == 1){
         return n;
      }
      if(n < 1){
         return n;
      }
      
      return n * fatorial(n-1);
   }
   
   public static int somarDigito(int n){
      if(n == 1){
         return n;
      }
      if(n < 1){
         return n;
      }
      
      return n + somarDigito(n-1);
   }
   
   public static int somarVetor(int[] v, int i){
      if(i == 0){
         return v[0];
      }
      
      return v[i] + somarVetor(v, i - 1);
   }
   
   public static int contarPares(int[] v, int i){
      if(i < 0){
         return 0;
      }
      
      if(v[i] % 2 == 0){
         return 1 + contarPares(v, i -1);
      }else{
         return contarPares(v, i -1);
      }
   }
   
   public static boolean ehPalindromo(String txt, int i, int f){
      if(i >= f){
         return true;
      }
      
      if(txt.charAt(i) != txt.charAt(f)){
         return false;
      }
      
      return ehPalindromo(txt, i + 1, f -1);
   }

   public static void main(String[] args){
      //System.out.println(fatorial(6));
      
      //System.out.println(somarDigito(6));
      
      int vetor[] = {2, 1, 2, 12};
      int tamanho = vetor.length - 1;
      
      //System.out.println(somarVetor(vetor, tamanho));
      
      //System.out.println(contarPares(vetor, tamanho));
      
      String palavra = "arara";
      boolean resultado = ehPalindromo(palavra, 0, palavra.length() - 1);
      System.out.println("E palindromo? " + resultado);
   }
}
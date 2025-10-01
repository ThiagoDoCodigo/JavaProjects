public class Main{

   public static int somarDigitos(int n){
      if(n == 1){
         return 1;
      }
      
      if(n <= 0){
         return n;
      }
      
      return n + somarDigitos(n-1);
   }
   
   public static int fibonacci(int n){
      if(n == 1){
         return 1;
      }
      
      if(n == 0){
         return 0;
      }
      
      return fibonacci(n-1) + fibonacci(n-2);
   }
   
   public static int potencia(int base, int expo){
      if(base == 1){
         return base;
      }
      if(expo == 1){
         return base;
      }
      if(expo == 0){
         return 1;
      }
      
      return base * potencia(base, expo - 1);
   }
   
   public static int fatorial(int n){
      if(n == 1){
         return n;
      }
      
      if(n <= 0){
         return -1;
      }
      
      return n * fatorial(n-1);
      
   }

   public static void main(String[] args){
      //System.out.println("Soma: " + somarDigitos(4));
      
      //System.out.println("fibonacci: " + fibonacci(4));
      
      int base = 3;
      int expo = 3;
      
      //System.out.println("potencia de " + base + " elevado a " + expo + " => " + potencia(base, expo));
      
      
      System.out.println("fatorial: " + fatorial(5));
   }
}
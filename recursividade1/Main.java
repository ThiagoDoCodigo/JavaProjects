public class Main{
   public static int fatorial(int n){
      if(n == 1){
         return 1;
      }
      
      return n * fatorial(n-1);
   }
   
   public static int multi(int a, int b){
      if(a == 0){
         return 1;
      } 
      
      if(a == 1){
         return b;
      }else if(b == 1){
         return a;
      }
      
      return b + multi(a - 1, b);
  }
  
  public static int somaPrev(int n){
      if(n == 1){
         return 1;
      }
      
      return n + somaPrev(n-1);
  }
  
  public static void contagemRegressiva(int n){
      if(n == 0){
         System.out.println(0);
         return; 
      }
      System.out.println(n);
      contagemRegressiva(n-1);
  }
  
  public static int somaDosDigitos(int n) {
        if (n < 10) {
            return n;
        }

        return n % 10 + somaDosDigitos(n / 10);
   }
   
   public static int fibonacci(int n) {
      if(n == 0){
         return 0;
      }
      if(n == 1){
         return 1;
      }
      
      return fibonacci(n-1) + fibonacci(n-2);
   }
   
   public static int potencia(int base, int expoente) {
      if(expoente == 1 || base == 1){
         return base;
      }
      if(expoente == 0){
         return 1;
      }
      
      return base * potencia(base, expoente - 1);
   }
      
   public static void main(String[] args){
      //System.out.println(fatorial(7));
      //System.out.println(multi(3, 4));
      //System.out.println(somaPrev(4));
      //contagemRegressiva(10);
      //System.out.println(somaDosDigitos(7459));
      //System.out.println(fibonacci(8));
      System.out.println(potencia(3, 4));
   }
}
public class Main{
   public static void main(String[] args){
      CartItems cart = new CartItems();
      
      cart.insertCart("Galaxy s25 ultra", 2);
      cart.insertCart("Galaxy s22", 3);
      cart.insertCart("Galaxy s25 ultra", 1);
      cart.insertCart("Samsung 4k 50", 4);
      cart.insertCart("Fone", 10);
      cart.insertCart("LG 4k 60", 2);
      
      
      //cart.removeItems("Samsung 4k 50", 4);
      //cart.removeItems("Tv samsung 4k 60", 1);
      //cart.removeItems("Galaxy s25 ultra", 2);
      
      
      cart.viewItems();  
      //cart.ordenarByQtd();
      //cart.viewItems(); 
      
      //cart.moveByPosition("Fone", 2);
      cart.invertCart();
   }
}
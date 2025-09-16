public class Main{
   public static void main(String[] args){
      Cart cart = new Cart();
      
      cart.insertTail("Galaxy s25 ultra", 2);
      cart.insertTail("Galaxy s22", 3);
      cart.insertTail("Galaxy s25 ultra", 1);
      cart.insertTail("Samsung 4k 50", 4);
      cart.insertTail("LG 4k 60", 2);
      
      //cart.removeItems("Tv samsung 4k 50", 4);
      //cart.removeItems("Tv samsung 4k 60", 1);
      //cart.removeItems("Galaxy s25 ultra", 2);
      
      
      cart.viewItems();  
      cart.ordenarByQtd();
      cart.viewItems(); 
   }
}
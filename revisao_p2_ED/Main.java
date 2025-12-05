public class Main{
   public static void main(String[] args){
      Tree tree = new Tree();
      
      tree.insert(10);
      tree.insert(9);
      tree.insert(12);
      tree.insert(5);
      tree.insert(20);
      tree.insert(2);
      
      System.out.println("Altura: " + tree.getHeight());
      
      System.out.println("Menor: " + tree.getSmall());
   }
}
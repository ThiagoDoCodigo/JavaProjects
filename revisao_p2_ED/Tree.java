public class Tree{
   private Sheet root;
   
   public Tree(){};
   
   public void insert(int value){
      this.root = insert(value, this.root);
   }
   
   private Sheet insert(int value, Sheet cursor){
      if(cursor == null){
         return new Sheet(value);
      }
      
      if(value < cursor.getValue()){
         cursor.setLeft(insert(value, cursor.getLeft()));
      }else if(value > cursor.getValue()){
         cursor.setRight(insert(value, cursor.getRight()));
      }
      
      return cursor;
   }
   
   public Sheet getSmall(){
      return getSmall(this.root);
   }
   
   private Sheet getSmall(Sheet cursor){
      if(cursor.getLeft() == null){
         return cursor;
      }
      
      return getSmall(cursor.getLeft());
   }
   
   public int getHeight(){
      return getHeight(this.root);
   }
   
   private int getHeight(Sheet cursor){
      if(cursor == null){
         return 0;
      }
      
      int heightLeft = getHeight(cursor.getLeft());
      int heightRight = getHeight(cursor.getRight());
      
      return Math.max(heightLeft, heightRight) + 1;
   }
}
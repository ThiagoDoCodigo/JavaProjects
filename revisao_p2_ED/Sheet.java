public class Sheet{
   private int value;
   private Sheet right;
   private Sheet left;
   
   public Sheet(int value){
      this.value = value;
   }
   
   public int getValue(){
      return this.value;
   }
   
   public void setValue(int value){
      this.value = value;
   }
   
   public Sheet getLeft(){
      return this.left;
   }
   
   public void setLeft(Sheet left){
      this.left = left;
   }
   
   public Sheet getRight(){
      return this.right;
   }
   
   public void setRight(Sheet right){
      this.right = right;
   }
   
   @Override
   public String toString(){
      return "Valor " +  this.value;
   }   

}
public class Sheet{
   private int valor;
   private Sheet left;
   private Sheet right;
   
   public Sheet(int valor){
      this.valor = valor;
      this.right = null;
      this.left = null;
   }
   
   public int getValor(){
      return this.valor;
   }
   
   public void setValor(int valor){
      this.valor = valor;
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

}
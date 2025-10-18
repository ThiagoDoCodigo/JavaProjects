public class Tree{
   private Sheet root;
   
   public void insert(int valor){
      this.root = insertRecursive(valor, this.root);
   }
   
   public Sheet insertRecursive(int valor, Sheet cursor){
      //caso de parada
      if(cursor == null){
         return new Sheet(valor);  
      }
      
      if(valor < cursor.getValor()){
         cursor.setLeft(insertRecursive(valor, cursor.getLeft()));
      }else if(valor > cursor.getValor()){
         cursor.setRight(insertRecursive(valor, cursor.getRight()));
      }
      
      return cursor;
   }
   
   public int getHeigth(){
      return getHeigth(this.root);
   }
   
   public int getHeigth(Sheet sheet){
      if(sheet == null){
         return 0;
      }
      
      int leftHeight = getHeigth(sheet.getLeft());
      int rightHeight = getHeigth(sheet.getRight());
      
      return Math.max(leftHeight, rightHeight) + 1;
   }
   
   public int getSheets(){
      return getSheets(this.root);
   }
   
   public int getSheets(Sheet sheet){
      if(sheet == null){
         return 0;
      }
      
      int left = getSheets(sheet.getLeft());
      int right = getSheets(sheet.getRight());
      
      return (left + right) + 1;
   }
   
   public Sheet getSmall(){
      return getSmall(this.root);
   }
   
   public Sheet getSmall(Sheet sheet){
      if(sheet == null){
         return null;
      }
      
      if(sheet.getLeft() == null){
         return sheet;
      }
      
      return getSmall(sheet.getLeft());
   }
}
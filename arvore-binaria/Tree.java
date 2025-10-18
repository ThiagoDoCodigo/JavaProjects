public class Tree{
   public Sheet root;
   
   public void insert(int valor){
      this.root = insertRecursive(this.root, valor);
   }
   
   public Sheet insertRecursive(Sheet cursor, int valor){
      //Caso trivial
      if(cursor == null){
         return new Sheet(valor);
      }
      
      
      //inserir a esquerda (menor)
      if(valor < cursor.getValor()){
         cursor.setLeft(insertRecursive(cursor.getLeft(), valor));
      }else{ //inserir a direira (Maior)
         cursor.setRight(insertRecursive(cursor.getRight(), valor));
      }
      
             
      return cursor;
   }
}
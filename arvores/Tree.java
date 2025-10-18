public class Tree{
   private Sheet root;
   
   public Tree() {
      this.root = null;
   }
   
   public void insert(int valor){
      this.root = insertRecursive(this.root, valor);
   }
   
   private Sheet insertRecursive(Sheet cursor, int valor){
      if(cursor == null){
         return new Sheet(valor);
      }
      
      if(valor < cursor.getValor()){
         cursor.setLeft(insertRecursive(cursor.getLeft(), valor));
      }else{
         cursor.setRight(insertRecursive(cursor.getRight(), valor));
      }
      
      return cursor;
   }
   
   public void percorrerEmOrdem() {
        percorrerEmOrdemRec(this.root);
        System.out.println();
    }

    private void percorrerEmOrdemRec(Sheet root) {
        if (root != null) {
            percorrerEmOrdemRec(root.getLeft());
            System.out.print(root.getValor() + " ");
            percorrerEmOrdemRec(root.getRight());
        }
    }
}
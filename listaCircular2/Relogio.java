public class Relogio{
   private Alien cursor;
   
   public Relogio(){
      this.cursor = null;
   }
   
   public void sayln(String txt){
      System.out.println(txt);
   }
   
   public void say(String txt){
      System.out.print(txt);
   }
   
   public void insertAlien(String nome){
      Alien novo = new Alien(nome);
      if(this.cursor == null){
         this.cursor = novo;
         this.cursor.setNext(novo);
      }else{
         novo.setNext(cursor.getNext());
         this.cursor.setNext(novo);
         this.cursor = novo;
      }
   }
   
   public void removeAlien(String nome){
      if(this.cursor == null){
         sayln("Lista vazia");
         return;
      }
      
      Alien atual = this.cursor.getNext();
      Alien prev = this.cursor;
      
      do{
         if(atual.getNome().equalsIgnoreCase(nome)){
            if(atual == atual.getNext()){
               this.cursor = null;
               sayln("Unico elemento excluido!");
            }else{
               prev.setNext(atual.getNext());
               atual.setNext(null);
               if(atual == this.cursor){
                  this.cursor = prev;
               }
            }
            return;
         }
         
         prev = atual;
         atual = atual.getNext();
      }while(atual != this.cursor.getNext());
      
      sayln("Alien nao encontrado!");
   }
   
   public void getList(){
      if(this.cursor == null){
         sayln("Lista vazia");
         return;
      }
      
      Alien atual = cursor.getNext();
      do{
         say("[" + atual.getNome() + " ]  =>  ");
         atual = atual.getNext();
      }while(atual != this.cursor.getNext());
      sayln("The end!");
   }
   
   public void nextAlien(){
      if(this.cursor == null){
         sayln("Lista vazia");
         return;
      }
      
      if(this.cursor == this.cursor.getNext()){
         sayln("Lista com apenas 1 alien!");
         return;
      }
      
      this.cursor = this.cursor.getNext();
      sayln("Atual: " + this.cursor.getNome());
   }
}
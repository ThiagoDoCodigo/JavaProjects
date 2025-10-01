public class Relogio{
   private Personagem cursor;
   private int length;
   
   public Relogio(){
      this.cursor = null;
      this.length = 0;
   }
   
   
   public void addPersonagem(String name){
      Personagem novo = new Personagem(name);
      
      if(this.cursor == null){
         this.cursor = novo;
         novo.setNext(this.cursor);
         this.length ++;
      }else{
         novo.setNext(this.cursor.getNext());
         this.cursor.setNext(novo);
         cursor = novo;
         this.length ++;
      }
   }
   
   public void getPersonagens(){
      if(this.cursor == null){
         System.out.println("Nenhum personagem encontrado!");
      }else{
         Personagem atual = this.cursor.getNext();
         Personagem end = this.cursor.getNext();
         do{
            System.out.print("[" + atual.getName() + "]  =>  ");
         
            atual = atual.getNext();
         }while(atual != end);
         System.out.println("The end!");
      }
   }
   
   public void movePersonagem(){
      if(this.cursor == null){
         System.out.println("Nenhum personagem encontrado!");
      }else{
         this.cursor = this.cursor.getNext();
         System.out.println("Personagem: " + this.cursor.getName());
      }
   }
   
   
   
   public void removePersonagem(String name){
      if(this.cursor == null){
         System.out.println("Nenhum personagem encontrado!");
      }else{
         Personagem prev = this.cursor;
         Personagem atual = this.cursor.getNext();
         Personagem end = this.cursor.getNext();
         do{
            if(atual.getName().equalsIgnoreCase(name)){
               if(atual.getNext() == atual){
                  this.cursor = null;
                  atual.setNext(null);
               }else{
                  if(this.cursor == atual){
                     this.cursor = prev;
                  }
                  prev.setNext(atual.getNext());
                  atual.setNext(null);
               }
               this.length --;
               return;
            }
            prev = atual;
            atual = atual.getNext();
         }while(atual != end);
         
         System.out.println("Personagem nao encontrado!");
      }
   }
}
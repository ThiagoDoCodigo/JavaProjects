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
         //Primeiro alien
         this.cursor = novo;
         this.cursor.setNext(novo);
      }else{
         novo.setNext(this.cursor.getNext());
         this.cursor.setNext(novo);
         this.cursor = novo;
      }
   } 
   
   public void removeAlien(String nome){
      if(this.cursor == null){
         //Lista vazia
         return;
      }
      
      Alien prev = this.cursor;
      Alien atual = this.cursor.getNext();
      do{
         if(atual.getNome().equalsIgnoreCase(nome)){
            if(atual == atual.getNext()){
               //So um elemento
               this.cursor = null;
            }else{
               //Juntar o anterior do que desejo com o proximo do mesmo
               prev.setNext(atual.getNext());
               atual.setNext(null);
               if(atual == this.cursor){
                  //Se o que quero apagar é o cursor
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
   
   
   
}
public class Playlist{
   MusicNode head;
   MusicNode tail;
   int tamanho;
   
   public void insertTail(String title){
      MusicNode nova = new MusicNode(title);
      if(this.head == null){
         this.head = nova;
         this.tail = nova;
         this.tamanho ++;
         return;
      }
      
      this.tail.setNext(nova);
      nova.setPrev(this.tail);
      this.tail = nova;
      this.tamanho ++;
   }
   
   public void insertHead(String title){
      MusicNode nova = new MusicNode(title);
      if(this.head == null){
         this.head = nova;
         this.tail = nova;
         this.tamanho ++;
         return;
      }
      
      this.head.setPrev(nova);
      nova.setNext(this.head);
      this.head = nova;  
      this.tamanho ++;
   }
   
   
   public void moveByPosition(String title, int newPos){
      if(this.head == null || newPos < 1 || newPos > this.tamanho){
         //lista vazia ou pos invalida
         return;
      }
      
      MusicNode selected = this.head;
      while(selected != null){
         if(selected.getTitle().equalsIgnoreCase(title)){
            if(selected.getPrev() == null && selected.getNext() == null){
               this.head = null;
               this.tail = null;
            }else if(selected.getPrev() == null){
               this.head = this.head.getNext();
               this.head.setPrev(null);
            }else if(selected.getNext() == null){
               this.tail = this.tail.getPrev();
               this.tail.setNext(null);
            }else{
               MusicNode prev = selected.getPrev();
               MusicNode next = selected.getNext();
               
               prev.setNext(next);
               next.setPrev(prev);
            }
            break;
         }
         selected = selected.getNext();
      }
      
      if(selected == null){
         //Nao encontrada
         return;
      }
      
      selected.setNext(null);
      selected.setPrev(null);
      
      
      if(this.head == null && newPos == 1){
         this.head = selected;
         this.tail = selected;
         return;
      }
      
      if(newPos == 1){
         this.head.setPrev(selected);
         selected.setNext(this.head);
         this.head = selected;
         return;
      }
      
      MusicNode cursor = this.head;
      int cont = 1;
      while(cursor != null){
         if(cont == newPos){
            if(cursor.getPrev() == null){
               this.head.setPrev(selected);
               selected.setNext(this.head);
               this.head = selected;
            }else{
               MusicNode prevMusic = cursor.getPrev();
               prevMusic.setNext(selected);
               selected.setPrev(prevMusic);
               selected.setNext(cursor);
               cursor.setPrev(selected);
            }
            return;
         }
         cursor = cursor.getNext();
         cont++;
      }
      
     
      this.tail.setNext(selected);
      selected.setPrev(this.tail);
      this.tail = selected;
 
      
   }
}
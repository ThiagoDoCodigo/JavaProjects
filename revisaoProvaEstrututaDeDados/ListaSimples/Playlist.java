public class Playlist{
   private MusicNode head;
   
   
   public void insert(String name){
      MusicNode nova = new MusicNode(name);
      
      if(this.head == null){
         this.head = nova;
      }else{
         MusicNode cursor = this.head;
         while(cursor.getNext() != null){
            cursor = cursor.getNext();
         }
         
         cursor.setNext(nova);
      }
   }
   
   
   public void invertList(){
      if(this.head == null){
         System.out.println("Lista vazia");
      }else if(this.head.getNext() == null){
         System.out.println("Lista com apenas um elemento");
      }else{
         MusicNode cursor = this.head;
         MusicNode prev = null;
         MusicNode next = null;
         
         while(cursor != null){
            next = cursor.getNext();
            cursor.setNext(prev);
            prev = cursor;
            cursor = next;
         }
         
         this.head = prev;
      }
   }
   
   public int getLength(){
      MusicNode cursor = this.head;
      int length = 0;
      
      while(cursor != null){
         length ++;
         cursor = cursor.getNext();
      }
      return length;
   }
   
   
   public void findCentral(){
      if(this.head == null){
         System.out.println("Lista vazia");
         return;
      }
      
      MusicNode cursor = this.head;
      MusicNode find = this.head;
      
      while(cursor != null){
         if(cursor.getNext() != null){
            cursor = cursor.getNext().getNext();
            find = find.getNext();
         }else{
            break;
         }
      }
      
      System.out.println("Musica central: "  + find.getName());
   }
   
   public void moveToPosition(int newPos, String name){
      if(this.head == null){
         System.out.println("Lista vazia");
         return;
      }
      
      if(newPos < 1){
         System.out.println("Posicao invalida!");
         return;
      }
         
      MusicNode prevFindMusic = this.head;   
      MusicNode findMusic = this.head.getNext();
      
      if(this.head.getName().equalsIgnoreCase(name)){
         findMusic = this.head;
         this.head = this.head.getNext();
         prevFindMusic = null;
      }else{
         while(findMusic != null){
            if(findMusic.getName().equalsIgnoreCase(name)){
               prevFindMusic.setNext(findMusic.getNext());
               break;
            }
            prevFindMusic = findMusic;
            findMusic = findMusic.getNext();
         }
      }
      
      if(findMusic == null){
         System.out.println("Musica nao encontrada!");
         return;
      }
      
      if(newPos == 1 && this.head == null){
         this.head = findMusic;
         return;
      }
      
      if(newPos == 1){
         findMusic.setNext(this.head);
         this.head = findMusic;
         return;
      }
      
      MusicNode prev = this.head;
      MusicNode cursor = this.head.getNext();
      int cont = 2;
      while(cursor != null){
         if(cont == newPos){
            prev.setNext(findMusic);
            findMusic.setNext(cursor);
            return;
         }
         prev = cursor;
         cursor = cursor.getNext();
         cont ++;
      }
      
      if(cont == newPos){
         prev.setNext(findMusic);
         findMusic.setNext(cursor);
      }else{
         if(prevFindMusic == null){
            findMusic.setNext(this.head);
            this.head = findMusic;
         }else{
            prevFindMusic.setNext(findMusic);
         }
      }
   }
   
   
   public void ordenar(){
      if(this.head == null){
         System.out.println("Lista vazia");
         return;
      }
      if(this.head.getNext() == null){
         System.out.println("Lista com apenas 1 elemento");
         return;
      }
      
      boolean trocou = false;
      do{
         MusicNode cursor = this.head;
         trocou = false;
         
         while(cursor.getNext() != null){
            if(cursor.getName().length() > cursor.getNext().getName().length()){
               String tempName = cursor.getNext().getName();
               
               cursor.getNext().setName(cursor.getName());
               cursor.setName(tempName);
               
               trocou = true;
            }
            cursor = cursor.getNext();
         }
          
      }while(trocou);
   }
}
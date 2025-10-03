public class Playlist{
   MusicNode head;
   
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
   
   public void exibir(){
      if(this.head == null){
         System.out.println("Lista vazia");
      }else{
         MusicNode cursor = this.head;
         while(cursor != null){
            System.out.print("[" + cursor.getName() + "]  =>  "); 
            cursor = cursor.getNext();
         }
         System.out.println("The end");
      }
   }
   
   public boolean findMusic(String name){
      if(this.head == null){
         return false;
      }else{
         MusicNode cursor = this.head;
         
         while(cursor != null){
            if(cursor.getName().equalsIgnoreCase(name)){
               return true;
            }
            cursor = cursor.getNext();
         }
         return false;
      }
   }
   
   public int getLength(){
      if(this.head == null){
         return 0;
      }else{
         int tamanho = 0;
         MusicNode cursor = this.head;
         while(cursor != null){
            tamanho ++;
            cursor = cursor.getNext();
         }
         return tamanho;
      }
   }
   
   
   public void insertHead(String name){
      MusicNode nova = new MusicNode(name);
      if(this.head == null){
         this.head = nova;
      }else{
         nova.setNext(this.head);
         this.head = nova;
      }
   }
   
   public void removeByName(String name){
      if(this.head == null){
         System.out.println("Lista vazia");
      }else{
         MusicNode prev = this.head;
         MusicNode cursor = this.head.getNext();
         if(this.head.getName().equalsIgnoreCase(name)){
            this.head = this.head.getNext();
         }else{
            while(cursor != null){
               if(cursor.getName().equalsIgnoreCase(name)){
                  prev.setNext(cursor.getNext());
                  return;
               }
               prev = cursor;
               cursor = cursor.getNext();
            }
            System.out.println("Nao encontrado");
         }
      }
   }
   
   public void insertByPosition(String name, int pos){
      MusicNode nova = new MusicNode(name);
      if(pos < 1 ){
         System.out.println("Posicao invalida");
         return;
      }
      
      if(this.head == null && pos == 1){
         this.head = nova;
      }else{
         if(pos == 1){
            nova.setNext(this.head);
            this.head = nova;
         }else{
            MusicNode prev = this.head;
            MusicNode cursor = this.head.getNext();
            int cont = 2;
            while(cursor != null){
               if(cont == pos){
                  prev.setNext(nova);
                  nova.setNext(cursor);
                  return;
               }
               prev = cursor;
               cursor = cursor.getNext();
               cont ++;
            }
            
            if(cont == pos){
               prev.setNext(nova);
            }else{
               System.out.println("Posicao invalida");
            }
         }
      }
   }
      
   public void removeByPosition(int pos){
      if(pos < 1 ){
         System.out.println("Posicao invalida");
         return;
      }
   
      if(this.head == null){
         System.out.println("Lista vazia");  
      }else{
         if(this.head.getNext() == null && pos == 1){
            this.head = null;
         }else if(pos == 1){
            this.head = this.head.getNext();
         }else{
            MusicNode prev = this.head;
            MusicNode cursor = this.head.getNext();
            int cont = 2;
            
            while(cursor != null){
               if(cont == pos){
                  prev.setNext(cursor.getNext());
                  return;
               }
               prev = cursor;
               cursor = cursor.getNext();
               cont ++;
            }
            System.out.println("Posicao invalida");
         }
      }
   }
   
    public void substituirValor(int pos, String name){
      if(pos < 1 ){
         System.out.println("Posicao invalida");
         return;
      }
   
      if(this.head == null){
         System.out.println("Lista vazia");  
      }else{
         if(pos == 1){
            this.head.setName(name);
         }else{
            MusicNode prev = this.head;
            MusicNode cursor = this.head.getNext();
            int cont = 2;
            
            while(cursor != null){
               if(cont == pos){
                  cursor.setName(name);
                  return;
               }
               prev = cursor;
               cursor = cursor.getNext();
               cont ++;
            }
            System.out.println("Posicao invalida");
         }
      }
   }

   public void findCentral(){
      if(this.head == null){
         System.out.println("Lista vazia");  
      }else if(this.head.getNext() == null){
         System.out.println("Meio: " + this.head.getName());  
      }else{
         MusicNode slow = this.head;
         MusicNode fast = this.head;
         
         while(fast != null){
            if(fast.getNext() != null){
               slow = slow.getNext();
               fast = fast.getNext().getNext();
            }else{
               break;
            }
         }
         System.out.println("Meio: " + slow.getName());  
         
      }
   }
   
   public void invertList(){
      if(this.head == null){
         System.out.println("Lista vazia");  
      }else if(this.head.getNext() == null){
         System.out.println("Apenas 1 elemento");  
      }else{
         MusicNode prev = null;
         MusicNode next = null;
         MusicNode cursor = this.head;
         
         while(cursor != null){
            next = cursor.getNext();
            cursor.setNext(prev);
            prev = cursor;
            cursor = next;
         }
         this.head = prev;
      }
   }
   
   public void joinPlaylist(Playlist playlist){
      if(playlist.head == null){
         System.out.println("Lista enviada esta vazia");  
      }else if(this.head == null){
         this.head = playlist.head;
      }else{
         MusicNode cursor = this.head;
         while(cursor.getNext() != null){
            cursor = cursor.getNext();
         }
         
         cursor.setNext(playlist.head);
      }
   }
}
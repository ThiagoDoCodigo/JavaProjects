public class Playlist{
   MusicNode head;
   MusicNode tail;
   
   
   public void say(String txt){
      System.out.print(txt);
   }
   
   public void sayln(String txt){
      System.out.println(txt);
   }
   
     
   public void insertHead(String title, String artist, int time){
      MusicNode newMusic = new MusicNode(title, artist, time);
      
      if(this.head == null){
         this.head = newMusic;
         this.tail = newMusic;
         sayln("A lista estava vazia! Musica inserida no inicio!");
      }else{
         newMusic.next = this.head;
         this.head.prev = newMusic;
         this.head = newMusic;
         sayln("Musica inserida no inicio com sucesso!");
      }
   }
   
   public void insertTail(String title, String artist, int time){
      MusicNode newMusic = new MusicNode(title, artist, time);
      
      if(this.head == null){
         this.head = newMusic;
         this.tail = newMusic;
         sayln("A lista estava vazia! Musica inserida no inicio!");
      }else{
         newMusic.prev = this.tail;
         this.tail.next = newMusic;
         this.tail = newMusic;
         sayln("Musica inserida no final com sucesso!");
      }
   }

   public int getTamanho(){
      MusicNode cursor = this.head;
      int tamanho = 0;
      
      while(cursor != null){
         tamanho ++;
         cursor = cursor.next;
      }
      
      return tamanho;
   }
   
   public void insertPosition(String title, String artist, int time, int newPos){
      MusicNode newMusic = new MusicNode(title, artist, time);
      
      if(newPos < 1){
         sayln("Posicao enviada invalida!");
         return;
      }
      
      if(this.head == null && newPos == 1){
         this.head = newMusic;
         this.tail = newMusic;
         sayln("A lista estava vazia! Musica inserida no inicio!");
         return;
      }
      
      if(newPos == 1){
         newMusic.next = this.head;
         this.head.prev = newMusic;
         this.head = newMusic;
         sayln("Musica inserida no inicio com sucesso!");
         return;
      }
      
      MusicNode cursor = this.head;
      int posAtual = 1;
      while(cursor != null){
         if(posAtual == newPos){
            MusicNode prev = cursor.prev;
            newMusic.next = cursor;
            newMusic.prev = prev;
            prev.next = newMusic;
            cursor.prev = newMusic;
            sayln("Musica inserida na posicao " + newPos + " com sucesso!");
            return;
         }
         posAtual ++;
         cursor = cursor.next;
      }
      
      if(posAtual == newPos && cursor == null){
         newMusic.prev = this.tail;
         this.tail.next = newMusic;
         this.tail = newMusic;
         sayln("Musica inserida no final com sucesso!");
      }else{
         sayln("Posicao enviada maior que a lista aceita!");
      } 
   }
   
   public void moveMusicToPosition(String title, int newPos){
      if(this.head == null){
         sayln("A lista encontra-se vazia!");
         return;
      }
      
      if(newPos < 1){
         sayln("Posicao enviada invalida!");
         return;
      }
      
      if(getTamanho() < newPos){
         sayln("Posicao enviada maior que a lista aceita!");
         return;
      }
      
      MusicNode musicSelected = this.head;
      int posAtual = 1;
       
      while(musicSelected != null){
         if(musicSelected.title.equals(title)){
            if(musicSelected.next == null && musicSelected.prev == null){
               this.head = null;
               this.tail = null;
            }else if(musicSelected.prev == null){
               this.head = this.head.next;
               this.head.prev = null;
            }else if(musicSelected.next == null){
               this.tail = this.tail.prev;
               this.tail.next = null;
            }else{
               MusicNode prev = musicSelected.prev;
               MusicNode next = musicSelected.next;
               
               prev.next = next;
               next.prev = prev;
            }
            sayln("Musica removida da posicao " + posAtual);
            break;
         }
         musicSelected = musicSelected.next;
         posAtual ++;
      }
      if(musicSelected == null){
         sayln("Musica nao encontrada!");
         return;
      }
      
      musicSelected.prev = null;
      musicSelected.next = null;
      
      if(this.head == null && newPos == 1){
         this.head = musicSelected;
         this.tail = musicSelected;
         sayln("A lista estava vazia! Musica inserida no inicio!");
         return;
      }
      
      MusicNode cursor = this.head;
      int posInsert = 1;
      while(cursor != null){
         if(posInsert == newPos){
            if(cursor.prev == null){
               this.head.prev = musicSelected;
               musicSelected.next = this.head;
               this.head = musicSelected;
               this.head.prev = null;
            }else{
               MusicNode prevInsert = cursor.prev;
               prevInsert.next = musicSelected;
               musicSelected.prev = prevInsert;
               musicSelected.next = cursor;
               cursor.prev = musicSelected;
            }
            sayln("Musica inserida na posicao " + newPos);
            return;
         }
         cursor = cursor.next;
         posInsert ++;
      }
      
      if(posInsert == newPos){
         musicSelected.prev = this.tail;
         this.tail.next = musicSelected;
         this.tail = musicSelected;
         this.tail.next = null;
         sayln("Musica inserida no final com sucesso!");
      }
   }
   
   public void invertList(){
      if(this.head == null){
         sayln("A lista esta vazia!");
         return;
      }
      if(this.head.next == null){
         sayln("A lista so possui 1 elemento!");
         return;
      }
      
      MusicNode cursor = this.head;
      MusicNode prev = null;
      MusicNode next = null;

      while(cursor != null){
         next = cursor.next;
         cursor.next = prev;
         cursor.prev = next;
         prev = cursor;
         cursor = next;
      }
      
      this.tail = this.head;
      this.head = prev;

   }
   
}


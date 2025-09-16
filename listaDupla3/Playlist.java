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
         sayln(title + " foi a primeira musica adicionada na lista!");
      }else{
         newMusic.next = this.head;
         this.head.prev = newMusic;
         this.head = newMusic;
         sayln("A musica " + title + " foi adicionada no inicio da lista com sucesso!");
      }   
   }
   
   public void insertTail(String title, String artist, int time){
      MusicNode newMusic = new MusicNode(title, artist, time);
      
      if(this.head == null){
         this.head = newMusic;
         this.tail = newMusic;
         sayln(title + " foi a primeira musica adicionada na lista!");
      }else{
         newMusic.prev = this.tail;
         this.tail.next = newMusic;
         this.tail = newMusic;
         sayln("A musica " + title + " foi adicionada no final da lista com sucesso!");
      }
   }
   
   public void insertPosition(String title, String artist, int time, int pos){
      MusicNode newMusic = new MusicNode(title, artist, time);
      
      if(pos < 1){
         sayln("Posicao invalida!");
         return;
      }
      
      if(pos == 1 && this.head == null){
         this.head = newMusic;
         this.tail = newMusic;
         sayln(title + " foi a primeira musica adicionada na lista!");
         return;
      }
      
      if(pos == 1){
         newMusic.next = this.head;
         this.head.prev = newMusic;
         this.head = newMusic;
         sayln("A musica " + title + " foi adicionada no inicio da lista com sucesso!");
         return;
      }
      
      MusicNode cursor = this.head;
      int cont = 1;
      while(cursor != null && cont < pos){
         cursor = cursor.next;
         cont++;
      }
      
      if(cursor == null && pos != cont){
         sayln("Posicao enviada maior que a lista aceita!");
         return;
      }
      
      if (cursor == null && cont == pos) {
         newMusic.prev = this.tail;
         this.tail.next = newMusic;
         this.tail = newMusic;
         sayln("A música " + title + " foi adicionada no final da lista com sucesso!");
         return;
      }
      
      MusicNode prev = cursor.prev;
      prev.next = newMusic;
      newMusic.prev = prev;        
      
      newMusic.next = cursor;
      cursor.prev = newMusic;
      sayln("A musica " + title + " foi adicionada na posicao " + pos + " da lista com sucesso!");
   }
   
   
   public void removeHead(){
      if(this.head == null){
         sayln("A lista esta vazia!");
         return;
      }
      
      if(this.head.next == null){
         this.head = null;
         this.tail = null;
         sayln("Unico elemento foi removido!");
         return;
      }
      
      this.head = this.head.next;
      this.head.prev = null;
      sayln("Elemento excluido com sucesso do inicio!");
   }  
   
   public void removeTail(){
      if(this.head == null){
         sayln("A lista esta vazia!");
         return;
      }
      
      if(this.head.next == null){
         this.head = null;
         this.tail = null;
         sayln("Unico elemento foi removido!");
         return;
      }
      
      this.tail = this.tail.prev;
      this.tail.next = null;
      sayln("Elemento excluido com sucesso do final!");
   }  
   
   public void removeByName(String title){
      if(this.head == null){
         sayln("A lista esta vazia!");
         return;
      }
      
      
      MusicNode cursor = this.head;
      while(cursor != null){
         if(cursor.title.equals(title)){
            break;
         }
         cursor = cursor.next; 
      }
      if(cursor == null){
         sayln("Musica nao encontrada!");
         return;
      }
      
      if(cursor.prev == null){
         this.head = this.head.next;
         if(this.head != null){
            this.head.prev = null;
         }else{
            this.tail= null;
         }
         
         sayln("Musica removida do inicio com sucesso!");
         return;
      }
      if(cursor.next == null){
         this.tail = this.tail.prev;
         this.tail.next = null;
         sayln("Musica removida do final com sucesso!");
         return;
      }
      
      MusicNode next = cursor.next;
      MusicNode prev = cursor.prev;
      
      next.prev = prev;
      prev.next = next;
      sayln("Musica removida com sucesso!");
   }
   
   
   public void deleteAll(){
      if(this.head == null){
         sayln("A lista esta vazia!");
         return;
      }
      
      if(this.head.next == null){
         this.head = null;
         this.tail = null;
         sayln("Unico elemento apagado!");
         return;
      }
      
      MusicNode cursor = this.head;
      while(cursor != null){
         MusicNode proximo = cursor.next;
         cursor.prev = null;
         cursor.next = null;
         cursor = proximo;
      }
      
      this.head = null;
      this.tail = null;
      sayln("Todos os elementos foram apagados com sucesso!");
   }
   
   public void exibirLista(){
      if(this.head == null){
         sayln("A lista esta vazia!");
      }else{
         MusicNode cursor = this.head;
         while(cursor != null){
            say(cursor.title + "  =>  ");
            cursor = cursor.next;
         }
         sayln("end");
      }
   }
   
   public void exibirListaInversa(){
      if(this.head == null){
         sayln("A lista esta vazia!");
      }else{
         MusicNode cursor = this.tail;
         while(cursor != null){
            say(cursor.title + "  =>  ");
            cursor = cursor.prev;
         }
         sayln("end");
      }
   }
   
   public void removerByPosition(int pos){
      if(this.head == null){
         sayln("A lista esta vazia!");
         return;
      }
      
      if(pos < 1){
         sayln("Posicao invalida!");
         return;
      }
      
      if(this.head.next == null && pos == 1){
         this.head = null;
         this.tail = null;
         sayln("Unico elemento foi removido!");
         return;
      }
      
      if(pos == 1){
         this.head = this.head.next;
         this.head.prev = null;
         sayln("Elemento removido da primeira posicao!");
         return;
      }
      
      MusicNode cursor = this.head;
      int cont = 1;
      while(cursor != null &&  cont < pos){
         cursor = cursor.next;
         cont ++;
      }
      
      if(cursor == null){
         sayln("Nao existe elemento na posicao enviada!");
      }else if(cursor.next == null){
         this.tail = this.tail.prev;
         this.tail.next = null;
         sayln("Elemento removido do final da lista!");
      }else{
         MusicNode prev = cursor.prev;
         MusicNode next = cursor.next;
         
         prev.next = next;
         next.prev = prev;
         
         sayln("Musica " + cursor.title + " removida com sucesso da posicao " + pos);
      } 
   }
   
   public void inverterLista(){
      if(this.head == null){
         sayln("A lista esta vazia!");
         return;
      }
      if(this.head.next == null){
         sayln("A lista so tem um elemento!");
         return;
      }
      
      MusicNode cursor = this.head;
      MusicNode next = null;
      MusicNode prev = null;
      while(cursor != null){
         next = cursor.next;
         cursor.prev = next;
         cursor.next = prev;
         prev = cursor;
         cursor = next;
      }
      
      this.tail = this.head;
      this.head = prev;
      
   }
   
   public int returnPositionByTitle(String title){
      if(this.head == null){
         sayln("A lista esta vazia!");
         return -1;
      }
      MusicNode cursor = this.head;
      int posAtual = 1;
      while(cursor != null && !cursor.title.equals(title)){
         cursor = cursor.next;
         posAtual ++;
      }
      
      if(cursor == null){
         sayln(title + " nao encontrada!");
         return -1;
      }else{
         return posAtual;
      }
   }
   
   public boolean returnBoolean(String title){
      if(this.head == null){
         return false;
      }
      MusicNode cursor = this.head;
      int posAtual = 1;
      while(cursor != null && !cursor.title.equals(title)){
         cursor = cursor.next;
         posAtual ++;
      }
      
      if(cursor == null){
         return false;
      }else{
         return true;
      }
   }
   
   public int getTamanho(){
      if(this.head == null){
         return 0;
      }
      MusicNode cursor = this.head;
      int tamanho = 1;
      while(cursor.next != null){
         cursor = cursor.next;
         tamanho ++;
      }
      
      return tamanho;
   }
   
   public void heandAndTail(){
      if(this.head == null){
         sayln("A lista esta vazia!");
         return;
      }
      sayln("Inicio: " + this.head.title);
      sayln("Ultima: " + this.tail.title);
   }
   
   public Playlist clonarLista(){
      Playlist listaClone = new Playlist();
       
      MusicNode cursor = this.head;
      
      while(cursor != null){
         listaClone.insertTail(cursor.title, cursor.artist, cursor.time);
         cursor = cursor.next;
      }
      
      return listaClone;
   }
   
   public void removerEveryByArtist(String artist){
      if(this.head == null){
         sayln("A lista esta vazia!");
         return;
      }
      
      MusicNode cursor = this.head;
      while(cursor != null){
         MusicNode next = cursor.next;
         if(cursor.artist.equals(artist)){
            MusicNode prev = cursor.prev;
            if(prev == null && next == null){
               this.head = null;
               this.tail = null;
               sayln("Unico elemento da lista apagado! Artista: " + artist + "Musica: " + cursor.title);
            }else if(prev == null){
               this.head = this.head.next;
               this.head.prev = null;
               sayln("Musica: " + cursor.title + " Artista: " + artist + " apagada!");
            }else if(next == null){
               this.tail = this.tail.prev;
               this.tail.next = null;
               sayln("Musica: " + cursor.title + " Artista: " + artist + " apagada do final!");
            }else{
               next.prev = prev;
               prev.next = next;
               sayln("Musica: " + cursor.title + " Artista: " + artist + " apagada!");
            }
         }
         cursor = next;
      }
   }
   
    public void manterSomenteArtista(String artist){
      if(this.head == null){
         sayln("A lista esta vazia!");
         return;
      }
      
      MusicNode cursor = this.head;
      while(cursor != null){
         MusicNode next = cursor.next;
         if(!cursor.artist.equals(artist)){
            MusicNode prev = cursor.prev;
            if(prev == null && next == null){
               this.head = null;
               this.tail = null;
               sayln("Unico elemento da lista apagado! Artista: " + artist + "Musica: " + cursor.title);
            }else if(prev == null){
               this.head = this.head.next;
               this.head.prev = null;
               sayln("Musica: " + cursor.title + " Artista: " + artist + " apagada!");
            }else if(next == null){
               this.tail = this.tail.prev;
               this.tail.next = null;
               sayln("Musica: " + cursor.title + " Artista: " + artist + " apagada do final!");
            }else{
               next.prev = prev;
               prev.next = next;
               sayln("Musica: " + cursor.title + " Artista: " + artist + " apagada!");
            }
         }
         cursor = next;
      }
   }
   
   public void moveToPosition(String title, int pos){
      if(this.head == null){
         sayln("A lista esta vazia!");
         return;
      }
      
      if(pos < 1){
         sayln("Posicao invalida!");
         return;
      }
      
      if(pos > (getTamanho() + 1)){
         sayln("Posicao maior que a lista aceita!");
         return;
      }
      
      MusicNode cursor = this.head;
      int posAtual = 1;
      while(cursor != null && !cursor.title.equals(title)){
         cursor = cursor.next;
         posAtual ++;
      }
      
      MusicNode musicSelected = cursor;
      cursor = null;
      
      if(musicSelected == null){
         sayln("Musica " + title + " nao encontrada!");
         return;
      }
      
      MusicNode next = null;
      MusicNode prev = null;
      
      if(musicSelected.prev == null && musicSelected.next == null){
         this.head = null;
         this.tail = null;
         sayln("Musica " + title + " removida do inicio da lista para ser inserida novamente!");         
      }else if(musicSelected.prev == null){
         this.head = this.head.next;
         this.head.prev = null;
         sayln("Musica " + title + " removida do inicio da lista para ser inserida novamente!");
      }else if(musicSelected.next == null){
         this.tail = this.tail.prev;
         this.tail.next = null;
         sayln("Musica " + title + " removida do final da lista para ser inserida novamente!");
      }else{
         next = musicSelected.next;
         prev = musicSelected.prev;
         next.prev = prev;
         prev.next = next;
         sayln("Musica " + title + " removida da lista na posicao " + posAtual + " para ser inserida novamente!");
      }
      
      
      cursor = this.head;
      posAtual = 1;
      
      if(cursor == null && pos == 1){
         this.head = musicSelected;
         this.tail = musicSelected;
         sayln("Musica " + title + " inserida na lista na posicao " + posAtual + " com sucesso!");
         return;
      }
      
      if(pos == 1){
         musicSelected.next = this.head;
         this.head.prev = musicSelected;
         this.head = musicSelected;
         musicSelected.prev = null;
         sayln("Musica " + title + " inserida na lista na posicao " + posAtual + " com sucesso!");
         return;
      }
      
      while(cursor != null && posAtual < pos){
         cursor = cursor.next;
         posAtual ++;
      }
      
      if(cursor == null && posAtual == pos){
         musicSelected.prev = this.tail;
         this.tail.next = musicSelected;
         this.tail = musicSelected;
         this.tail.next = null;
         sayln("Musica " + title + " inserida na lista na posicao " + posAtual + " com sucesso!");
      }else{
         prev = cursor.prev;
         
         prev.next = musicSelected;
         musicSelected.prev = prev;
         
         cursor.prev = musicSelected;
         musicSelected.next = cursor;
         sayln("Musica " + title + " inserida na lista na posicao " + posAtual + " com sucesso!");
      }
    
   }
   
   

   
}


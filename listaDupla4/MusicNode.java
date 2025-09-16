public class MusicNode{
   String title;
   String artist;
   int time;
   MusicNode next;
   MusicNode prev;
      
   public MusicNode(String title, String artist, int time){
     this.title = title;
     this.artist = artist;
     this.time = time;
     this.next = null;
     this.prev = null;       
   }
}
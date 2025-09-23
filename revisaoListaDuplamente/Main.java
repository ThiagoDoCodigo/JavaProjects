public class Main{
   public static void main(String[] args){
      Playlist playlist = new Playlist();
      
      playlist.insertTail("Comfortably numb");     
      playlist.insertTail("Money");
      playlist.insertTail("Time");
      playlist.insertTail("Sultans of swing");
      
      playlist.moveByPosition("time", 2);
   }
}
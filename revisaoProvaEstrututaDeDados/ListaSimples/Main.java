public class Main{
   public static void main(String[] args){
      Playlist playlist = new Playlist();
      
      System.out.println("Tamanho: " + playlist.getLength());
      
      playlist.insert("Money");
      playlist.insert("Time");
      playlist.insert("Sultans of swing");
      playlist.insert("De manha");
      playlist.insert("Ceu azul");
      
      //System.out.println("Tamanho: " + playlist.getLength());
   
      //playlist.findCentral();
      
      //playlist.invertList();
      
      //playlist.moveToPosition(5, "Time");
      
      playlist.ordenar();
   }
}
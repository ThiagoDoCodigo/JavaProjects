public class Main{
   public static void main(String[] args){
      Playlist playlist = new Playlist();
      System.out.println("Tamanho: " + playlist.getTamanho());
      playlist.insertHead("Money", "Pink Floyd", 478);
      //playlist.heandAndTail();
      playlist.insertTail("Time", "Pink Floyd", 422);
      
      playlist.insertTail("Sutans of swing", "Dire straits", 402);
      playlist.insertTail("As coisas que eu te disse ontem", "Vera loca", 412);
      playlist.insertTail("Pontes indestrutiveis", "Charlie Browm Jr", 250);
      playlist.insertTail("Comfortably numb", "Pink Floyd", 502);
      
      System.out.println("Tamanho: " + playlist.getTamanho());
      //playlist.removeByName("Comfortably numb");
      //playlist.deleteAll();
      
      
      System.out.println("=================================================================");
   
      playlist.moveMusicToPosition("Sutans of swing", 5);
      
      playlist.invertList();
   }
}

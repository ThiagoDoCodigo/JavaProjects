public class Main{
   public static void main(String[] args){
      Playlist playlist = new Playlist();
      Playlist playlist2 = new Playlist();
      
      System.out.println("Tamanho: " + playlist.getLength());
      
      playlist.insert("Money");
      playlist.insert("Time");
      playlist.insert("Black");
      
      System.out.println("Tamanho: " + playlist.getLength());
      playlist2.insert("Sultans of swing");
      playlist2.insert("De manha");
      playlist2.insert("Ceu azul");
      
      playlist.joinPlaylist(playlist2);
      
     
      
      //playlist.removeByName("De manha");
      
      //playlist.insertByPosition("De manha", 5);
      
      //playlist.exibir();
      
      //playlist.removeByPosition(5);
      
      playlist.substituirValor(5, "Creep");
      
      String encontrada = playlist.findMusic("ceu azul") ? "Encontrada" : "Nao encontrada";
      
      System.out.println("Encontrada: " + encontrada);
      
      
      System.out.println("Tamanho: " + playlist.getLength());
   
      playlist.findCentral();
      
      playlist.invertList();
      
      //playlist.ordenar();
   }
}
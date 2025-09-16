public class Main{
   public static void main(String[] args){
      Playlist playlist = new Playlist();
      System.out.println("Tamanho: " + playlist.getTamanho());
      playlist.insertTail("Money", "Pink Floyd", 478);
      playlist.heandAndTail();
      playlist.insertTail("Time", "Pink Floyd", 422);
      
      playlist.insertPosition("Sutans of swing", "Dire straits", 402, 2);
      playlist.insertTail("As coisas que eu te disse ontem", "Vera loca", 412);
      playlist.insertTail("Pontes indestrutiveis", "Charlie Browm Jr", 250);
      playlist.insertTail("Comfortably numb", "Pink Floyd", 502);
      
      //playlist.removeByName("Comfortably numb");
      //playlist.deleteAll();
      
      
      System.out.println("=================================================================");
      playlist.exibirLista();
      System.out.println("=================================================================");
      playlist.exibirListaInversa();
      System.out.println("=================================================================");
      //playlist.removerByPosition(2);
      //System.out.println("=================================================================");
      playlist.exibirLista();
      System.out.println("=================================================================");
      //playlist.inverterLista();
      //System.out.println("=================================================================");
      System.out.println("Posicao: " + playlist.returnPositionByTitle("Time"));
      System.out.println("=================================================================");
      boolean verificarExistencia = playlist.returnBoolean("Time");
      System.out.println(verificarExistencia ? "Existe!" : "Nao existe!");
      System.out.println("=================================================================");
      System.out.println("Tamanho: " + playlist.getTamanho());
      System.out.println("=================================================================");
      playlist.heandAndTail();
      Playlist listaClonada = playlist.clonarLista();
      System.out.println("=================================================================");
      listaClonada.exibirLista();
      System.out.println("=================================================================");
      //listaClonada.removerEveryByArtist("Pink Floyd");
      //listaClonada.manterSomenteArtista("Charlie Browm Jr");
      //listaClonada.moveToPosition("Time", 1);
      //listaClonada.moveToPosition("Money", 6);
      listaClonada.moveToPosition("Comfortably numb", 2);
      listaClonada.moveToPosition("Time", 4);
   }
}

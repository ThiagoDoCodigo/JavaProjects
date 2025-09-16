public class Main{
   public static void main(String[] args){
      Playlist lista = new Playlist();
      
      lista.adicionarNoFinal("Comfortably numb");
      lista.adicionarNoFinal("Money");
      lista.adicionarNoFinal("Time");
      lista.adicionarNoFinal("Creep");
      lista.adicionarNoFinal("Sultans of swing");
      lista.adicionarNoFinal("Brothers in arms");
      
      lista.inverterLista();
      
      lista.trocaDeLugar("Money", 1);
      lista.trocaDeLugar("Time", 6);
      lista.trocaDeLugar("Money", 6);
      lista.trocaDeLugar("Creep", 2);
   }
}
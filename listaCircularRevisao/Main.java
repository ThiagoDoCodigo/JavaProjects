public class Main{
   public static void main(String[] args){
      Relogio relogio = new Relogio();
      
      relogio.addPersonagem("Thiago");
      
      relogio.addPersonagem("Massa cinzenta");
      relogio.addPersonagem("Charlie Harper");
      relogio.addPersonagem("Walter white");
      relogio.addPersonagem("Lucas");
      
      relogio.getPersonagens();
      
      //relogio.movePersonagem();
      
      
      relogio.removePersonagem("Lucas");
   }
}
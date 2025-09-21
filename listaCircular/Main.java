public class Main{
   public static void main(String[] args){
      Relogio relogio = new Relogio();
      
      relogio.addAlien("Massa cinzenta");
      relogio.addAlien("Mr. Cannabis");
      relogio.addAlien("PI");
      relogio.addAlien("PI2");
      
      relogio.removeAlien("PI2");
      
      relogio.getInfo();
   }
}
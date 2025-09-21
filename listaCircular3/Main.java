public class Main{
   public static void main(String[] args){
      Relogio relogio = new Relogio();
      
      relogio.insertAlien("Zorg");
      relogio.insertAlien("Blip");
      relogio.insertAlien("Mr. Cannabis");
      relogio.insertAlien("Massa cinzenta");
      relogio.insertAlien("Xenon");

      

      relogio.removeAlien("Xenon");

      //relogio.getList(); 

      //relogio.removeAlien("Zorg");
      //relogio.removeAlien("Xenon");
      
      //relogio.nextAlien();
     
   }
}
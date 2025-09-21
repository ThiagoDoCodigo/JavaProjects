public class Main{
   public static void main(String[] args){
      Relogio relogio = new Relogio();
      
      relogio.insertAlien("Zorg");
      relogio.insertAlien("Blip");
      relogio.insertAlien("Xenon");
      relogio.insertAlien("Massa cinzenta");
      relogio.insertAlien("Mr. Cannabis");

      //relogio.getList();  

      //relogio.removeAlien("Blip");

      //relogio.getList(); 

      //relogio.removeAlien("Zorg");
      //relogio.removeAlien("Xenon");

      relogio.getList(); 
      
      relogio.nextAlien();
      relogio.nextAlien();
      relogio.nextAlien();
      relogio.nextAlien();
      relogio.nextAlien();
      relogio.nextAlien();
      relogio.nextAlien();
      relogio.nextAlien();
   }
}
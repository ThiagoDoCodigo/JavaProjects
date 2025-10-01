public class Personagem{
   private String name;
   private Personagem next;
   
   public Personagem(String name){
      this.name = name;
      this.next = null;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   public void setName(String name){
      this.name = name;
   }
   
   public Personagem getNext(){
      return this.next;
   }
   
   public void setNext(Personagem next){
      this.next = next;
   }
}

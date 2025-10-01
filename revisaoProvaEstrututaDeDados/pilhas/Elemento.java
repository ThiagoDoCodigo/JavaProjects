public class Elemento{
   private String name;
   private Elemento prev;
   
   public Elemento(String name){
      this.name = name;
      this.prev = null;
   }
   
   public String getName(){
      return this.name;
   }
   
   public void setName(String name){
      this.name = name;
   }
   
   public Elemento getPrev(){
      return this.prev;
   }
   
   public void setPrev(Elemento prev){
      this.prev = prev;
   }
   
   @Override
   public String toString(){
      return "Nome: " + this.name;
   }
}
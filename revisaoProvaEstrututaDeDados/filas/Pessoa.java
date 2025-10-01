public class Pessoa{
   private String name;
   private Pessoa prev;
   private Pessoa next;
   
   
   public Pessoa(String name){
      this.name = name;
      this.prev = null;
      this.next = null;
   }
    
   public String getName(){
      return this.name;
   }
   
   public void setName(String name){
      this.name = name;
   }
   
   public Pessoa getPrev(){
      return this.prev;
   }
   
   public void setPrev(Pessoa prev){
      this.prev = prev;
   }
   
    public Pessoa getNext(){
      return this.next;
   }
   
   public void setNext(Pessoa next){
      this.next = next;
   }
   
   @Override
   public String toString(){
      return "Nome: " + this.name;
   }
}
public class Alien{
   private String nome;
   private Alien next;
   
   public Alien(String nome){
      this.nome = nome;
      this.next = null;
   }
   
   public String getNome(){
      return this.nome;
   }
   
   public void setNome(String nome){
      this.nome = nome;
   }
   
   public Alien getNext(){
      return this.next;
   }
   
   public void setNext(Alien next){
      this.next = next;
   }
}
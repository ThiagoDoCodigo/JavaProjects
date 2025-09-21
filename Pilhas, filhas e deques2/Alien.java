public class Alien{
   private String nome;
   
   public Alien(String nome){
      this.nome = nome;
   }
   
   public String getNome(){
      return this.nome;
   }
   
   public void setNome(String nome){
      this.nome = nome;
   }
   
   @Override
   public String toString(){
      return this.nome;
   }
}
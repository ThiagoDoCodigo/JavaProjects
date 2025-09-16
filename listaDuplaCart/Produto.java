public class Produto{
   private String nome;
   private int qtd;
   private Produto prev;
   private Produto next;
   
   public Produto(String nome, int qtd){
      this.nome = nome;
      this.qtd = qtd;
      this.prev = null;
      this.next = null;
   }
   
   public String getNome(){
      return this.nome;
   }
   
   public void setNome(String nome){
      this.nome = nome;
   }
   
   public int getQtd(){
      return this.qtd;
   }
   
   public void setQtd(int qtd){
      this.qtd = qtd;
   }
   
   public Produto getPrev(){
      return this.prev;
   }
   
   public void setPrev(Produto prev){
      this.prev = prev;
   }
   
   public Produto getNext(){
      return this.next;
   }
   
   public void setNext(Produto next){
      this.next = next;
   }
}
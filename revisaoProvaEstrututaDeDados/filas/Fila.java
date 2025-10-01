public class Fila{
   private Pessoa head;
   private Pessoa tail;
   
   public void add(String name){
      Pessoa nova = new Pessoa(name);
      
      if(this.head == null){
         this.head = nova;
         this.tail = nova;
      }else{
         nova.setPrev(this.tail);
         this.tail.setNext(nova);
         this.tail = nova;
      }
   }
   
   public void poll(){
      if(this.head == null){
         System.out.println("Lista vazia");
      }else{
         if(this.head.getNext() == null){
            this.head = null;
            this.tail = null;
         }else{
            Pessoa pessoaPoll = this.head;
            this.head = this.head.getNext();
            this.head.setPrev(null);
            pessoaPoll.setNext(null);
         } 
      }
   }
}
public class FilaComPilha{
   private Elemento tail;
     
   public void setTail(Elemento tail){
      this.tail = tail;
   }  
   
   public void push(String name){
      Elemento novo = new Elemento(name);
      
      if(this.tail == null){
         this.tail = novo;
      }else{
         novo.setPrev(this.tail);
         this.tail = novo;
      }
   }
   
   public void pop(){
      if(this.tail == null){
         System.out.println("Lista vazia");
      }else{
         Elemento elementoPop = this.tail;
         this.tail = this.tail.getPrev();
         elementoPop.setPrev(null);
         if(this.tail == null){
            System.out.println("Unico elemento foi removido!");
         }
      }
      
   }
   
   public void poll(FilaComPilha fila){
      FilaComPilha pilhaNova = new FilaComPilha();
      
      Elemento cursor = fila.peek();
      while(cursor != null){
         pilhaNova.push(cursor.getName());
         cursor = cursor.getPrev();
      }
      pilhaNova.pop();
      
      FilaComPilha normalizada = new FilaComPilha();
      Elemento cursor2 = pilhaNova.peek();
      while(cursor2 != null){
         normalizada.push(cursor2.getName());
         cursor2 = cursor2.getPrev();
      }
      fila.setTail(normalizada.peek()); 
   }
   
   public Elemento peek(){
      return this.tail;
   }
   
}
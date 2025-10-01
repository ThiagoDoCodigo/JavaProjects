public class Pilha{
   private Elemento tail;
   
   
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
   
   public Elemento peek(){
      return this.tail;
   }
   
   
   public boolean validarExpressao(String expressao){
      Pilha pilha = new Pilha();
      
      for(int i = 0; i < expressao.length(); i++){
         char c = expressao.charAt(i);
         
         if(c == '(' || c == '[' || c == '{'){
            pilha.push(String.valueOf(c));
         }else if(c == ')' || c == ']' || c == '}'){
            Elemento topo = pilha.peek();
            
            if(topo == null){
               return false; //sem abertura
            }
            
            char topoChar = topo.getName().charAt(0);
            
            if(
               (c == ')' && topoChar == '(') ||
               (c == '}' && topoChar == '{') ||
               (c == ']' && topoChar == '[')
            ){
               pilha.pop();
            }else{
               return false;
            }
         }
      }  
      return pilha.peek() == null ? true : false;
   }
   
   public void inverterPalavra(String txt){
      Pilha pilha = new Pilha();
      
      for(int i = 0; i < txt.length(); i ++){
         char c = txt.charAt(i);
         
         pilha.push(String.valueOf(c));
      }
      
      
      Elemento cursor = pilha.peek();
      while(cursor != null){
         System.out.print(cursor.getName());
         cursor = cursor.getPrev();
      }
   }
}
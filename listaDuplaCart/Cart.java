public class Cart{
   private Produto head;
   private Produto tail;
   private int tamanho;
   
   public Cart(){
      this.head = null;
      this.tail = null;
      this.tamanho = 0;
   }
   
   public void sayln(String txt){
      System.out.println(txt);
   }
   public void say(String txt){
      System.out.print(txt);
   }
   
   public void insertTail(String nome, int qtd){
      if(qtd < 1){
         sayln("Quantidade invalida!");
         return;
      }
   
      Produto novo = new Produto(nome, qtd);
      if(this.head == null){
         this.head = novo;
         this.tail = novo;
         this.tamanho ++;
         sayln("Primeiro produto adicionado com sucesso ao carrinho!");
      }else{
         Produto cursor = this.head;
         while(cursor != null){
            if(cursor.getNome().equals(nome)){
               int novaQtd = cursor.getQtd() + qtd;
               cursor.setQtd(novaQtd);
               sayln("Quantidade do produto " + nome + " alterada com sucesso, quantidade: " + novaQtd);
               return;
            }
            cursor = cursor.getNext();
         }
         
         this.tail.setNext(novo);
         novo.setPrev(this.tail);
         this.tail = novo;
         this.tamanho ++;
         sayln("Produto adicionado no carrinho com sucesso!");
      }
   }
   
   public void removeItems(String nome, int qtd){
      Produto cursor = this.head;
      
      while(cursor != null){
         if(cursor.getNome().equals(nome)){
            if(qtd == cursor.getQtd()){
               if(cursor.getNext() == null && cursor.getPrev() == null){
                  this.head = null;
                  this.tail = null;
               }else if(cursor.getPrev() == null){
                  this.head = this.head.getNext();
                  if(this.head != null) this.head.setPrev(null);
               }else if(cursor.getNext() == null){
                  this.tail = this.tail.getPrev();
                  this.tail.setNext(null);
               }else{
                  Produto prev = cursor.getPrev();
                  Produto next = cursor.getNext();
                  
                  prev.setNext(next);
                  next.setPrev(prev);
               }
               this.tamanho --;
               sayln("Produto removido do carrinho com sucesso!");
               return;
            }else{
               if(cursor.getQtd() < qtd){
                  sayln("Quantidade enviada invalida!");
                  return;
               }else{
                  int novaQtd = cursor.getQtd() - qtd;
                  cursor.setQtd(novaQtd);
                  sayln("Quantidade do produto atualizada no carrinho com sucesso!");
                  return;
               }
            }
         }
         cursor = cursor.getNext();
      }
      sayln("Produto nao encontrado no carrinho!");
   }
   
   public void viewItems(){
      if(this.head == null){
         sayln("Carrinho vazio!");
         return;
      }
   
      Produto cursor = this.head;
      while(cursor != null){
         say(cursor.getNome() + " - " + cursor.getQtd() + "   =>   ");
         cursor = cursor.getNext();
      }
      say("Final\n");
   }
   
   public void ordenarByQtd(){
      if(this.head == null){
         sayln("Carrinho vazio!");
         return;
      }
      
      
      boolean trocou;
      do{
         trocou = false;
         Produto cursor = this.head;
         while(cursor.getNext() != null){
            Produto next = cursor.getNext();
            if(cursor.getQtd() > next.getQtd()){
               String tempNome = cursor.getNome();
               int tempQtd = cursor.getQtd();
                             
               cursor.setNome(next.getNome());
               cursor.setQtd(next.getQtd());
               
               next.setNome(tempNome);
               next.setQtd(tempQtd);
               trocou = true;
            }
            cursor = cursor.getNext();
         }
      }while(trocou);
   }
}
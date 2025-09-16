public class CartItems{
   private Produto head;
   private Produto tail;
   private int tamanho;
   
   public CartItems(){
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
   
   public void insertCart(String nome, int qtd){
      if(qtd < 1){
         sayln("Quantidade invalida");
         return;
      }
      
      Produto novo = new Produto(nome, qtd);
    
      if(this.head == null){
         this.head = novo;
         this.tail = novo;
         this.tamanho ++;
         sayln("Primeiro produto adicionado");
         return;
      }
      
      Produto cursor = this.head;
      while(cursor != null){
         if(cursor.getNome().equals(nome)){
            int novaQtd = cursor.getQtd() + qtd;
            cursor.setQtd(novaQtd);
            sayln("Quantidade incrementada a: " + nome);
            return;
         }
         cursor = cursor.getNext();
      }
      this.tail.setNext(novo);
      novo.setPrev(this.tail);
      this.tail = novo;
      this.tamanho ++;
      sayln("Produto adicionado");
   }
   
   
   public void removeItems(String nome, int qtd){
      if(this.head == null){     
         sayln("Carrinho vazio");
         return;
      }
      
      if(qtd < 1){
         sayln("Quantidade invalida");
         return;
      }
      
      Produto cursor = this.head;
      while(cursor != null){
         if(cursor.getNome().equals(nome)){
            if(cursor.getQtd() == qtd){
               if(cursor.getPrev() == null && cursor.getNext() == null){
                  this.head = null;
                  this.tail = null;
                  sayln("Unico produto removido");
               }else if(cursor.getPrev() == null){
                  this.head = this.head.getNext();
                  this.head.setPrev(null);
                  sayln("Primeiro produto removido");
               }else if(cursor.getNext() == null){
                  this.tail = this.tail.getPrev();
                  this.tail.setNext(null);
               }else{
                  Produto prev = cursor.getPrev();
                  Produto next = cursor.getNext();
                  
                  next.setPrev(prev);
                  prev.setNext(next);
                  sayln("Produto removido");
               }
               this.tamanho --;
               return;
            }else{
               if(cursor.getQtd() < qtd){
                  sayln("Quantidade invalida");
                  return;
               }
               int novaQtd = cursor.getQtd() - qtd;
               cursor.setQtd(novaQtd);
               sayln("Quantidade alterada para " + nome);
               return;
            }
         }
         cursor = cursor.getNext();
      }
      sayln("Produto nao encontrado");
   }
   
   public void ordenarByQtd(){
      if(this.head == null){
         sayln("Lista vazia");
         return;
      }
      if(this.head == this.tail){
         sayln("1 elemento");
         return;
      }
      
      boolean trocou = false;
      do{
         trocou = false;
         Produto cursor = this.head;
         while(cursor != null  && cursor.getNext() != null){
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
      sayln("Ordenado");
   }
   
   public void viewItems(){
      if(this.head == null){
         sayln("Lista vazia");
         return;
      }
      
      Produto cursor = this.head;
      while(cursor != null){
         say("[" + cursor.getNome() + " - " + cursor.getQtd() + "]  =>  ");
         cursor = cursor.getNext();
      }
      sayln("Final");
   }
   
   public void moveByPosition(String nome, int newPos){
      if(this.head == null){
         sayln("Lista vazia");
         return;
      }
      if(newPos < 1){
         sayln("Posicao invalida");
         return;
      }
      if(newPos > this.tamanho){
         sayln("Posicao nao aceita");
         return;
      }
      
      Produto produtoMove = this.head;
      while(produtoMove != null){
         if(produtoMove.getNome().equals(nome)){
            if(produtoMove.getPrev() == null && produtoMove.getNext() == null){
               this.head = null;
               this.tail = null;
            }else if(produtoMove.getPrev() == null){
               this.head = this.head.getNext();
               this.head.setPrev(null);
            }else if(produtoMove.getNext() == null){
               this.tail = this.tail.getPrev();
               this.tail.setNext(null);
            }else{
               Produto prev = produtoMove.getPrev();
               Produto next = produtoMove.getNext();
               
               prev.setNext(next);
               next.setPrev(prev);
            }
            sayln("Removido");
            break;
         }
         produtoMove = produtoMove.getNext();
      }
      
      if(produtoMove == null){
         sayln("Nao encontrado");
         return;
      }
      
      produtoMove.setNext(null);
      produtoMove.setPrev(null);
      
      if(newPos == 1 && this.head == null){
         this.head = produtoMove;
         this.tail = produtoMove;
         sayln("Inserido");
         return;
      }
      
      if(newPos == 1){
         this.head.setPrev(produtoMove);
         produtoMove.setNext(this.head);
         this.head = produtoMove;
         sayln("Inserido");
         return;
      }
      
      Produto cursor = this.head;
      int posAtual = 1;
      while(cursor != null){
         if(posAtual == newPos){
            if(cursor.getPrev() == null){
               this.head.setPrev(produtoMove);
               produtoMove.setNext(this.head);
               this.head = produtoMove;
               sayln("Inserido");
               return;
            }else{
               Produto prev = cursor.getPrev();
               prev.setNext(produtoMove);
               produtoMove.setPrev(prev);
               
               produtoMove.setNext(cursor);
               cursor.setPrev(produtoMove);
               sayln("Inserido");
               return;
            }
         }
         posAtual ++;
         cursor = cursor.getNext();
      }
      
      this.tail.setNext(produtoMove);
      produtoMove.setPrev(this.tail);
      this.tail = produtoMove;
      sayln("Inserido");
   }
   
   public void invertCart(){
      if(this.head == null){
         sayln("Lista vazia!");
         return;
      }   
      
      if(this.head.getNext() == null){
         sayln("Um elemento");
         return;
      }
      
      
      Produto cursor = this.head;
      Produto prev = null;
      Produto next = null;
      
      while(cursor != null){
         next = cursor.getNext();
         cursor.setPrev(next);
         cursor.setNext(prev);
         prev = cursor;
         cursor = next;
      }
      
      this.tail = this.head;
      this.head = prev;
   }
   
}
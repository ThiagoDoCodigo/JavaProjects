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
   
   public void insertTail(String nome, int qtd){
      Produto novo = new Produto(nome, qtd);
      
      if(this.head == null){
         this.head = novo;
         this.tail = novo;
         this.tamanho ++;
         sayln(nome + " adicionado no carrinho no inicio com sucesso!");
      }else{
         Produto cursor = this.head; 
         while(cursor != null){
            if(cursor.getNome().equals(nome)){
               int novaQtd = cursor.getQtd() + qtd;
               cursor.setQtd(novaQtd);
               sayln("Quantidade atualiza com sucesso para: " + nome);
               return;
            }
            cursor = cursor.getNext();
         }
         this.tail.setNext(novo);
         novo.setPrev(this.tail);
         this.tail = novo;
         this.tamanho ++;
         sayln("Novo produto adicionado com sucesso!");
      }
   }
   
   public void removeItem(String nome, int qtd){
      if(this.head == null){
         sayln("Nao ha produtos no carrinho!");
         return;
      }else{
         Produto cursor = this.head;
         while(cursor != null){
            if(cursor.getNome().equals(nome)){
               if(qtd == cursor.getQtd()){
                  if(cursor.getPrev() == null && cursor.getNext() == null){
                     this.head = null;
                     this.tail = null;
                  }else if(cursor.getPrev() == null){
                     this.head = this.head.getNext();
                     this.head.setPrev(null);
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
                  sayln(nome + " removido do carrinho com sucesso!");
               }else{
                  if(qtd > cursor.getQtd()){
                     sayln("Quatidade invalida!");
                     return;
                  }
                  int novaQtd = cursor.getQtd() - qtd;
                  cursor.setQtd(novaQtd);
               }
               return;
            }
            cursor = cursor.getNext();
         }
         sayln("Produto nao encontrado no carrinho!");
      }
   }
   
}
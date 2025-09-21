public class Relogio{
   Alien cursor;
   
   public Relogio(){
      this.cursor = null;
   }
   
   public void sayln(String txt){
      System.out.println(txt);
   }
   public void say(String txt){
      System.out.print(txt);
   }
   
   public void addAlien(String nome){
      Alien novo = new Alien(nome);
      if(this.cursor == null){
         this.cursor = novo;
         this.cursor.setNext(novo);
         sayln("Alien " + nome + " foi o primeiro adicionado!");
      }else{
         novo.setNext(this.cursor.getNext());
         this.cursor.setNext(novo);
         this.cursor = novo;
         sayln("Alien " + nome + " adicionado com sucesso!");
      }
   }
   
   public void removeAlien(String nome){
      if(this.cursor == null){
         sayln("Relogio vazio!");
      }else{
         Alien atual = this.cursor.getNext();
         Alien prev = this.cursor;
         boolean achou = false;
         do{           
            if(atual.getNome().equals(nome)){
               if(atual == atual.getNext()){
                  this.cursor = null;
               }else{
                  prev.setNext(atual.getNext());
                  atual.setNext(null);
                  if(atual == this.cursor){
                     cursor = prev;
                  }
               }
               sayln("Alien " + nome + " removido!");
               achou = true;
               break;
            }
            prev = atual;
            atual = atual.getNext();
         }while(atual != this.cursor.getNext());
         if(achou == false){
            sayln("Alien nao encontrado!");
         }
      }
   }
   
   public void getInfo(){
      if(this.cursor == null){
         sayln("Relogio vazio!");
      }else{
         Alien atual = this.cursor.getNext();
         do{           
            say("[ " + atual.getNome() + " ]  =>  ");  
            atual = atual.getNext();
         }while(atual != this.cursor.getNext());
         sayln("The end");
      }
   }
}
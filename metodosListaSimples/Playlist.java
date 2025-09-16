public class Playlist{
   MusicaNode inicio;
   MusicaNode musicaAtual;
   int tamanho;
   
   
   
   public void adicionarNoFinal(String nome){
      MusicaNode novaMusica = new MusicaNode(nome);
      
      if(this.inicio == null){
         this.inicio = novaMusica;
         System.out.println("Lista vazia, musica adicionada no inicio!");
         tamanho ++;
         return;
      }
      
      if(this.inicio.proximo ==  null){
         this.inicio.proximo = novaMusica;
         System.out.println("Musica adicionada na segunda posicao!");
         tamanho ++;
         return;
      }
      
      MusicaNode atual = this.inicio;
      while(atual.proximo != null){
         atual = atual.proximo;
      }
      atual.proximo = novaMusica;
      tamanho ++;
      System.out.println("Musica adicionada na posicao: " + tamanho);   
   }
   
   public void trocaDeLugar(String nome, int novaPos){
      if(this.inicio == null){
         System.out.println("A lista esta vazia!");
         return;
      }
      
      if(novaPos < 1){
         System.out.println("Posicao invalida!");
         return;
      }
      
      MusicaNode musicaEscolhida = this.inicio;
      MusicaNode musicaAnterior = null;
      int posAtual = 1;
      while(musicaEscolhida != null && !musicaEscolhida.nome.equals(nome)){
         musicaAnterior = musicaEscolhida;
         musicaEscolhida = musicaEscolhida.proximo;
         posAtual ++;
      }
      
      if(musicaEscolhida == null){
         System.out.println("Musica nao encontrada!");
         return;
      }
      
      if(posAtual == novaPos){
         System.out.println("Musica ja nao posicao desejada!");
         return;
      }
      
      if(musicaAnterior == null){
         this.inicio = this.inicio.proximo;
         System.out.println("Musica removida do inicio!");
      }else{
         musicaAnterior.proximo = musicaEscolhida.proximo;
         System.out.println("Musica removida da posicao: " + posAtual);
      }
      
      if(novaPos == 1){
         musicaEscolhida.proximo = this.inicio;
         this.inicio = musicaEscolhida;
         System.out.println("Musica adicionada no inicio!");
         return;
      }
      
      
      MusicaNode atual = this.inicio;
      MusicaNode anterior = null;
      int contador = 1;
      
      while(atual != null && contador < novaPos){
         anterior = atual;
         atual = atual.proximo;
         contador ++;
      }
      
      if(atual == null){
         System.out.println("Musica adicionada no final!");
      }else{
         System.out.println("Musica adicionada na posicao: " + novaPos);
      }
      
      anterior.proximo = musicaEscolhida;
      musicaEscolhida.proximo = atual;
   }
   
   public void inverterLista(){
      if(this.inicio == null){
         System.out.println("Lista vazia!");
         return;
      }
      if(this.inicio.proximo == null){
         System.out.println("Lista com apenas um elemento!");
         return;
      }
      
      
      MusicaNode proximo = null;
      MusicaNode atual = this.inicio;
      MusicaNode anterior = null;
      
      while(atual != null){
         proximo = atual.proximo;
         atual.proximo = anterior;
         anterior = atual;
         atual = proximo;
      }
      this.inicio = anterior;
   }
   
}
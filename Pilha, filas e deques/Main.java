import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main{
   public static void main(String[] args){
    
      //Pilhas:
      Stack <Alien> pilha = new Stack<>();
      
      //Push: inserir no final
      pilha.push(new Alien("Zorg"));
      pilha.push(new Alien ("Blip"));
      pilha.push(new Alien("Xenu"));
      
      //peek = topo da pilha
      System.out.println("Topo: " + pilha.peek());
      
      //Pop = remover do topo
      System.out.println("Desempilhando: " + pilha.pop());
      
      //Pilha atual:
      System.out.println("Pilha atual: " + pilha);
      
      //Pop = remover do topo
      System.out.println("Desempilhando: " + pilha.pop());
      
      //Pilha atual:
      System.out.println("Pilha atual: " + pilha);
      
      System.out.println("=================================================================================================");
      
      
      //Filas:
      Queue <Alien> fila = new LinkedList<>();
      
      fila.add(new Alien("Zorg"));
      fila.add(new Alien ("Blip"));
      fila.add(new Alien("Xenu"));
      
      //peek = inicio da fila
      System.out.println("Topo: " + fila.peek());
      
      //poll = remover da lista
      System.out.println("Removendo: " + fila.poll());
      
      //Fila atual:
      System.out.println("Fila atual: " + fila);
      
      System.out.println("=================================================================================================");
      
      //Deques:
      Deque<Alien> deque = new ArrayDeque<>();
      
      deque.addFirst(new Alien("Zorg"));
      deque.addLast(new Alien("Blip"));
      deque.addFirst(new Alien("Xenu"));
      
      System.out.println("Deque atual: " + deque);
      System.out.println("Removido da frente: " + deque.removeFirst());
      System.out.println("Removido de tras: " + deque.removeLast());    
      System.out.println("Deque final: " + deque); 
   }
}
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main{
   public static void main(String[] args){
      Stack<Alien> pilha = new Stack<>();
      
      pilha.push(new Alien("Zorg"));
      pilha.push(new Alien("Mr. Cannabis"));
      pilha.push(new Alien("Blip"));
      pilha.push(new Alien("Massa cinzenta"));
      
      
      System.out.println("Desempilhando: " + pilha.pop());
      System.out.println("Desempilhando: " + pilha.pop());
      
      System.out.println("Pilha: " + pilha);
      
      System.out.println("\n===============================================================================\n");
      
      Queue<Alien> fila = new LinkedList<>();
      
      fila.add(new Alien("Zorg"));
      fila.add(new Alien("Blip"));
      fila.add(new Alien("Mr. Cannabis"));
      fila.add(new Alien("Massa cinzenta"));
      
      System.out.println("Retirando: " + fila.poll());
      System.out.println("Retirando: " + fila.poll());
      
      System.out.println("Fila: " + fila);
      
      System.out.println("\n===============================================================================\n");
      
      Deque<Alien> deque = new ArrayDeque<>();
      
      deque.addFirst(new Alien("Zorg"));    
      deque.addLast(new Alien("Mr. Cannabis"));
      deque.addLast(new Alien("Blip"));
      deque.addLast(new Alien("Massa cinzenta"));
      
      System.out.println("Removendo do topo: " + deque.removeFirst());
      System.out.println("Removendo do final: " + deque.removeLast());
      
      System.out.println("Deque: " + deque);
      
   }
}
public class Main{
   public static void main(String[] args){
      Fila fila = new Fila();
      
      
      fila.add("Money");
      fila.add("Time");
      fila.add("Hold the line");
      fila.add("De borest");
      
      fila.poll();
      fila.poll();
      fila.poll();
      fila.poll();
   }
}
public class Main{
   public static void main(String[] args){
      FilaComPilha fila = new FilaComPilha(); 
   
      fila.push("Money");
      fila.push("Time");
      fila.push("Hold the line");
      fila.push("De borest");
      
      
      fila.poll(fila);
   }
}
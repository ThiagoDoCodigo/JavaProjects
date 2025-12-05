public class Main{
   public static void main(String[] args){
      Carro car1 = new Carro("Toyota", "Corolla", "ABC-1234", 1.50, "Prata", 4);
      
      ContabilizarCorrida cont = new ContabilizarCorrida();
      
      double custo = car1.calcularCusto(15);
      cont.registrar(car1, 15);
      
      System.out.println(car1.exibirDesc());
      System.out.printf("Custo Total da Corrida: R$ %.2f%n", custo);
      
      
      System.out.println("Resumo da Jornada");
      System.out.println("Total de Corridas Realizadas: " + cont.numCorridas);
      System.out.print("Valor Total Arrecadado: R$ " + cont.valorTotal);
   }
}
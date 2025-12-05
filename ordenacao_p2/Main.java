public class Main{
   public static int[] bubbleSort(int[] vetor){
      boolean trocou;
      
      do{
         trocou = false;
         
         int tamanho = vetor.length;
         for(int i = 0; i < tamanho - 1; i ++){
            if(vetor[i] > vetor[i+1]){
               int temp = vetor[i+1];
               
               vetor[i+1] = vetor[i];
               vetor[i] = temp;
               
               trocou = true;
            }
         }
         
      }while(trocou);
   
      return vetor;
   }

   public static void main(String[] args){
      int vetor[] = { 2, 5, 1, 10, 3, 25, 11, 54, 12};
      int tamanho = vetor.length;
      System.out.println("Vetor desornedado: ");
      for(int i = 0; i < tamanho; i++){
         System.out.print(" " + vetor[i] + " ");
      }
      
      vetor = bubbleSort(vetor);
      System.out.println("\n\nVetor ordenado: ");
      for(int i = 0; i < tamanho; i++){
         System.out.print(" " + vetor[i] + " ");
      }
   }
}
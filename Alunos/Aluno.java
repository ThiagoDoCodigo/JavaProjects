public class Aluno{
   String nome;
   double nota1;
   double nota2;
   double nota3;
   
   public Aluno(String nome, double nota1, double nota2, double nota3){
      this.nome = nome;
      this.nota1 = nota1;
      this.nota2 = nota2;
      this.nota3 = nota3;
   }
   
   public void imprimirResultado(){
      double soma = (nota1 * 0.3) + (nota2 * 0.35) + (nota3 * 0.35);
      double mediaFinal = soma;
      
      System.out.println("\n========================================\n");
      System.out.print("Nome: " + nome);
      
      System.out.println("\n========================================\n");
      System.out.printf("Nota 1: %.2f\n",nota1);
      System.out.printf("Nota 1 com o peso(30): %.2f\n",nota1*0.3);
      
      System.out.println("\n========================================\n");
      System.out.printf("Nota 2: %.2f\n",nota2);
      System.out.printf("Nota 2 com o peso(35): %.2f\n",nota2*0.35);
      
      System.out.println("\n========================================\n");
      System.out.printf("Nota 2: %.2f\n",nota3);
      System.out.printf("Nota 2 com o peso(35): %.2f\n",nota3*0.35);
      System.out.println("\n========================================\n");
      
      if(mediaFinal < 60){
         System.out.printf("Media final: %.2f\n", mediaFinal);
         System.out.println("Infelizmento nao foi dessa vez! Reprovado");
      }else if(mediaFinal >= 60 && mediaFinal < 90){
         System.out.printf("Media final: %.2f\n", mediaFinal);
         System.out.println("Parabens! Aprovado");
      }else if(mediaFinal >= 90){
         System.out.printf("Media final: %.2f\n", mediaFinal);
         System.out.println("Voce mandou bem demais!! Aprovadissimo!");
      }
   }
   
}
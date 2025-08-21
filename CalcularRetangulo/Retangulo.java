public class Retangulo{
   double largura;
   double altura;
   
   public Retangulo(double largura, double altura){
      this.largura = largura;
      this.altura = altura;
   }
   
   public void imprimirValoresRetangulo(){
      double area = largura * altura;
      double perimetro = (largura * 2) + (altura * 2);
      double diagonal = Math.sqrt((largura * largura) + (altura * altura));
      
      System.out.println("------------------------------------");
      System.out.println("Dados do retangulo:");
      System.out.println("Altura: " + altura + " cm");
      System.out.println("Largura: " + largura + " cm");
      System.out.println("Area: " + area + " cm2");
      System.out.println("Perimetro: " + perimetro + "cm");
      System.out.printf("Diagonal: %.2f cm\n", diagonal);
      System.out.println("------------------------------------");
   }
}
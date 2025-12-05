public class Main {
    public static void main(String[] args) {
        System.out.println("=====================================================");
        System.out.println("Sistema de Calculo de Corrida por Tipo de Transporte");
        System.out.println("-----------------------------------------------------");

        double distancia = 15.5;
        System.out.printf("Distancia da Corrida: %.1f Km%n", distancia);
        System.out.println("-----------------------------------------------------");

        Transporte carro1 = new Carro("Toyota", "Corolla", "ABC-1234", 1.50, "Prata", 4);
        Transporte moto1 = new Moto("Honda", "CBR 500R", "XYZ-5678", 0.95, "Vermelha", 500);

        ContabilizacaoCorridas contabilizacao = new ContabilizacaoCorridas();

        double custoCarro = carro1.calcularCusto(distancia);
        contabilizacao.registrarCorrida(carro1, distancia);
        System.out.println(carro1.exibirDescricao());
        System.out.printf("Custo Total da Corrida: R$ %.2f%n", custoCarro);
        System.out.println("-----------------------------------------------------");

        double custoMoto = moto1.calcularCusto(distancia);
        contabilizacao.registrarCorrida(moto1, distancia);
        System.out.println(moto1.exibirDescricao());
        System.out.printf("Custo Total da Corrida: R$ %.2f%n", custoMoto);

        System.out.println("=====================================================");
        System.out.println("Resumo da Jornada");
        System.out.println("Total de Corridas Realizadas: " + contabilizacao.getTotalCorridas());
        System.out.printf("Valor Total Arrecadado: R$ %.2f%n", contabilizacao.getValorTotal());
        System.out.println("=====================================================");
    }
}

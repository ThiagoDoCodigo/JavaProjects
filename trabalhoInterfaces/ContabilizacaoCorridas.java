public class ContabilizacaoCorridas {
    private int totalCorridas;
    private double valorTotal;

    public void registrarCorrida(Transporte transporte, double km) {
        double valorCorrida = transporte.calcularCusto(km);
        totalCorridas++;
        valorTotal += valorCorrida;
    }

    public int getTotalCorridas() { return totalCorridas; }
    public double getValorTotal() { return valorTotal; }
}

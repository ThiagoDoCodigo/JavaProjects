public class Moto extends Veiculo implements Transporte {
    private int cilindradas;
    private static final double TAXA_FIXA = 1.80;

    public Moto(String marca, String modelo, String placa, double custoKmRodado, String cor, int cilindradas) {
        super(marca, modelo, placa, custoKmRodado, cor);
        this.cilindradas = cilindradas;
    }

    @Override
    public double calcularCusto(double km) {
        return (km * getCustoKmRodado()) + TAXA_FIXA;
    }

    @Override
    public String exibirDescricao() {
        StringBuilder sb = new StringBuilder();
        sb.append("Informacoes da Moto\n");
        sb.append("Tipo de Transporte: Moto\n");
        sb.append("Marca: ").append(getMarca()).append("\n");
        sb.append("Modelo: ").append(getModelo()).append("\n");
        sb.append("Placa: ").append(getPlaca()).append("\n");
        sb.append("Cor: ").append(getCor()).append("\n");
        sb.append("Cilindradas: ").append(cilindradas).append("cc\n");
        sb.append(String.format("Custo por Km: R$ %.2f\n", getCustoKmRodado()));
        sb.append(String.format("Taxa Fixa: R$ %.2f\n", TAXA_FIXA));
        return sb.toString();
    }
}

public class Carro extends Veiculo implements Transporte {
    private int numPortas;
    private static final double TAXA_FIXA = 2.50;

    public Carro(String marca, String modelo, String placa, double custoKmRodado, String cor, int numPortas) {
        super(marca, modelo, placa, custoKmRodado, cor);
        this.numPortas = numPortas;
    }

    @Override
    public double calcularCusto(double km) {
        return (km * getCustoKmRodado()) + TAXA_FIXA;
    }

    @Override
    public String exibirDescricao() {
        StringBuilder sb = new StringBuilder();
        sb.append("Informacoes do Carro\n");
        sb.append("Tipo de Transporte: Carro\n");
        sb.append("Marca: ").append(getMarca()).append("\n");
        sb.append("Modelo: ").append(getModelo()).append("\n");
        sb.append("Placa: ").append(getPlaca()).append("\n");
        sb.append("Cor: ").append(getCor()).append("\n");
        sb.append("Numero de Portas: ").append(numPortas).append("\n");
        sb.append(String.format("Custo por Km: R$ %.2f\n", getCustoKmRodado()));
        sb.append(String.format("Taxa Fixa: R$ %.2f\n", TAXA_FIXA));
        return sb.toString();
    }
}

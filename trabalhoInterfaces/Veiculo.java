public abstract class Veiculo {
    private String marca;
    private String modelo;
    private String placa;
    private double custoKmRodado;
    private String cor;

    public Veiculo(String marca, String modelo, String placa, double custoKmRodado, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.custoKmRodado = custoKmRodado;
        this.cor = cor;
    }

    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public String getPlaca() { return placa; }
    public double getCustoKmRodado() { return custoKmRodado; }
    public String getCor() { return cor; }
}

public abstract class Veiculo {
    protected String marca;
    protected String modelo;
    protected String placa;
    protected double valorKm;
    protected String cor;

    public Veiculo(String marca, String modelo, String placa, double valorKm, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.valorKm = valorKm;
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getValorKm() {
        return valorKm;
    }

    public void setValorKm(double valorKm) {
        this.valorKm = valorKm;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}

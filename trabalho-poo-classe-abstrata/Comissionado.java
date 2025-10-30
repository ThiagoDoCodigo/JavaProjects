public class Comissionado extends Funcionario {
    private double valorVendas;
    private double comissao;

    public Comissionado(String nome, String cpf, double valorVendas, double comissao) {
        super(nome, cpf);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return valorVendas * 0.06;
    }
    
    @Override
    public void exibirDados() {
        System.out.println("=== Funcionario Comissionado ===");
        super.exibirDados();
        System.out.printf("Valor em vendas: R$ %.2f%n", this.valorVendas);
        System.out.println("Comissao: " + comissao*100 + "%");
        System.out.println("------------------------\n");
    }
}

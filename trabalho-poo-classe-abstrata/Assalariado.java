public class Assalariado extends Funcionario {
    private double salarioFixo;

    public Assalariado(String nome, String cpf, double salarioFixo) {
        super(nome, cpf);
        this.salarioFixo = salarioFixo;
    }

    @Override
    public double calcularSalario() {
        return salarioFixo;
    }
    
    @Override
    public void exibirDados() {
        System.out.println("=== Funcionario Assalariado ===");
        super.exibirDados();
        System.out.println("------------------------\n");
    }
}

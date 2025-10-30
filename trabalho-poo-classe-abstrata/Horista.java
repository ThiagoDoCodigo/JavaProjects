public class Horista extends Funcionario {
    private int horasTrabalhadas;
    private double valorHora;

    public Horista(String nome, String cpf, int horasTrabalhadas, double valorHora) {
        super(nome, cpf);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabalhadas * this.valorHora;
    }
    
    @Override
    public void exibirDados() {
        System.out.println("=== Funcionario Horista ===");
        super.exibirDados();
        System.out.printf("Valor por hora: R$ %.2f%n", this.valorHora);
        System.out.println("Horas trabalhadas: " + this.horasTrabalhadas + "h");
        System.out.println("------------------------\n");
    }
}

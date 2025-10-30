public abstract class Funcionario {
    protected String nome;
    protected String cpf;

    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public boolean validarDocumento(String doc) {
        String apenasNumeros = doc.replaceAll("[^0-9]", "");
        return apenasNumeros.length() == 11;
    }
      
    //Metodo abstrato
    public abstract double calcularSalario();

    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Documento valido? " + (validarDocumento(this.cpf) ? "SIM" : "NÃO"));
        System.out.printf("Salario: R$ %.2f%n", calcularSalario());
    }
}

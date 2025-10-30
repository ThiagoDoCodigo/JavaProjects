public class Main {
    public static void main(String[] args) {

        Funcionario func1 = new Horista("Ana", "123.456.789-00", 40, 50);
        func1.exibirDados();

        Funcionario func2 = new Comissionado("Bruno", "987.654.321-00", 30000, 0.06);
        func2.exibirDados();

        Funcionario func3 = new Assalariado("Carla", "111.222.333-44", 3000);
        func3.exibirDados();
    }
}

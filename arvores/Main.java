public class Main {
    public static void main(String[] args) {
        Tree arvore = new Tree();

        arvore.insert(10);
        arvore.insert(5);
        arvore.insert(15);
        arvore.insert(3);
        arvore.insert(7);

        System.out.print("Percurso em ordem: ");
        arvore.percorrerEmOrdem(); // Deve imprimir: 3 5 7 10 15
    }
}

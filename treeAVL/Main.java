public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        int[] values = {30, 20, 10, 25, 40, 50, 45};
        for (int v : values) {
            tree.insert(v);
        }

        //System.out.println("In-order traversal (sorted):");
        //tree.printInOrder(tree.root);

        //System.out.println("\n\nBalance factors:");
        //tree.printBalanceFactors(tree.root);

        //System.out.println("\nTotal tree height: " + tree.getTotalHeight());
    }
}

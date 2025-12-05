public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        //int[] values = {10, 20, 30, 5, 3, 50, 40, 70, 60};
        //for (int v : values) {
        //    tree.insert(v);
        //}
        
       // int[] values = {30, 20, 10, 40, 50, 25, 22, 60, 55, 70};

       // for (int v : values) {
        //    tree.insert(v); 
        //}

        int[] values = {50, 25, 75, 10, 30, 60, 80};

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

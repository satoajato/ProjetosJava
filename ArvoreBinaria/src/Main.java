public class Main {
    public static void main(String[] args) {
        Arvore<Integer> tree = new Arvore<Integer>();
        tree.add(10);
        tree.add(5);
        tree.add(8);
        tree.add(17);
        tree.add(15);
        tree.add(3);
        tree.add(9);
        tree.add(12);
        tree.add(1);
        tree.add(4);
        tree.add(7);
        tree.add(20);
        tree.add(22);
        tree.add(16);
        tree.add(19);
        System.out.print("\nEm ordem: ");
        tree.emOrdem(tree.getRaiz());
        System.out.print("\nPré-ordem: ");
        tree.preOrdem(tree.getRaiz());
        System.out.print("\nPós-ordem: ");
        tree.posOrdem(tree.getRaiz());
    }
}

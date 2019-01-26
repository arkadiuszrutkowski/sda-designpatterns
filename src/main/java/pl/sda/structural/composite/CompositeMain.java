package pl.sda.structural.composite;

public class CompositeMain {

    public static void main(String[] args) {
        Tree tree = new Tree();

        TreeBranch branch1 = new TreeBranch();
        branch1.addTreeElement(new TreeLeaf());
        branch1.addTreeElement(new TreeLeaf());

        TreeBranch branch2 = new TreeBranch();
        branch2.addTreeElement(branch1);
        branch2.addTreeElement(new TreeLeaf());

        tree.addTreeElement(new TreeLeaf());
        tree.addTreeElement(branch2);
        tree.print();
    }
}

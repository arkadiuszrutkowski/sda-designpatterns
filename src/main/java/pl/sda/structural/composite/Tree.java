package pl.sda.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Tree {

    private final List<TreeElement> treeElements = new ArrayList<TreeElement>();

    public void addTreeElement(TreeElement element) {
        treeElements.add(element);
    }

    public void print() {
        System.out.println("This is tree");
        for (TreeElement element : treeElements) {
            element.print();
        }
    }
}

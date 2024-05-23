package org.datastructures.LinkedList.Node;

public class Test {
    public static void main(String[] args) {
        LinkedListStructure myList = new LinkedListStructure();
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);
        myList.add(7);
        myList.add(8);
        myList.add(9);
        myList.add(10);

        myList.addFirstNode(88);
        myList.printAllData();
        myList.addLastNode(99);
        myList.printAllData();
        myList.deleteIndexOf(6);
        myList.printAllData();
        myList.deleteFirstNode();
        myList.printAllData();


        myList.addIndexOf(3,2);
        myList.printAllData();

    }
}

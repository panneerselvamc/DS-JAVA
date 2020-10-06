package org.linkedlist;

public class MainMethod {
    public static void main(String[] args) {
        LinkedList<String> linkedList= new LinkedList<>();
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        linkedList.add("4");
        System.out.println(String.format("SIZE OF LINKED LIST IS %d",linkedList.getSize()));
        System.out.println("+++++++++++++++++++++ PRINTING THE DATA PRESENT IN LINKED LIST ++++++++++++++++++");
        linkedList.printData();
        System.out.println("+++++++++++++++++++++DELETING HEAD++++++++++++++++++");
        linkedList.deleteHead();
        System.out.println(String.format("SIZE OF LINKED LIST AFTER DELETING HEAD %d",linkedList.getSize()));
        System.out.println("+++++++++++++++++++++ PRINTING THE DATA PRESENT IN LINKED LIST ++++++++++++++++++");
        linkedList.printData();
        System.out.println("DELETING DATA: 3");
        linkedList.delete("3");
        System.out.println("+++++++++++++++++++++ PRINTING THE DATA PRESENT IN LINKED LIST ++++++++++++++++++");
        linkedList.printData();

    }
}

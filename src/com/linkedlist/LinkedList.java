package com.linkedlist;

public class LinkedList<T> {
    private Node<T> head=null;
    private int size;

    public void add(T data){
        Node node=new Node(data);
        if(head==null) {
            this.head = node;
            size = 1;
        }
        else{
            Node<T> currentNode=head;
            while (currentNode.getNext()!=null){
                currentNode=currentNode.getNext();
            }
            currentNode.setNext(node);
            size++;
        }
    }

    public void addAtHead(T data){
        Node node=new Node(data);
        if(head==null) {
            head = node;
            size = 1;
        }
        else{
            node.setNext(head);
            head=node;
            size++;
        }

    }

    public void deleteHead(){
        Node temp=head;
        head=temp.getNext();
        size--;
    }

    public void delete(T data){
        Node currentNode=head.getNext();
        Node previousNode=head;

        if(head==null){
            System.out.println("List is Empty. so can't delete anything");
        }
        else if(head.getData()==data){
            head=head.getNext();
            size--;
        }
        else {
            while (currentNode != null && currentNode.getData() != data) {
                previousNode=currentNode;
                currentNode = currentNode.getNext();
            }
            if(currentNode==null){
                System.out.println("UNABLE TO FIND THE ELEMENT");
            }
            else if(currentNode.getData()==data){
                previousNode.setNext(currentNode.getNext());
                size--;
            }
        }
    }

    public void printData(){
        Node currentNode=head;
        while (currentNode!=null){
            System.out.println(currentNode.getData().toString());
            currentNode=currentNode.getNext();
        }
    }
    public int getSize(){
        return size;
    }
}

/*
Time Complexity:
For Adding an Element: O(N)
For Adding an Element in Head: O(1)
For Deleting an Element : O(N)
For Deleting Head Element: O(1)
 */

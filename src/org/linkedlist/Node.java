package org.linkedlist;

public class Node<T> {
    private T data;
    private Node next;

    Node(T data){
        this.data=data;
        setNext(null);
    }

    public void setNext(Node<T> next){
        this.next=next;
    }
    public T getData(){
        return data;
    }
    public Node<T> getNext(){
        return next;
    }
}

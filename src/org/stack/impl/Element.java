package org.stack.impl;

public class Element<T> {

    private T data;
    private Element next;

    public Element(T data,Element next){
        this.data=data;
        this.next=next;
    }
    public T getData() {
        return data;
    }

    public Element getNext() {
        return next;
    }

}

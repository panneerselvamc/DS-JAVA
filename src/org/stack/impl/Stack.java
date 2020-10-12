package org.stack.impl;

public class Stack<T> {
    private Element<T> top=null;
    private int size=0;
    private final static int MAX_SIZE=40;

    public void push(T data) throws Exception {
        if(size==MAX_SIZE){
            throw new Exception();
        }
        Element<T> element=new Element<>(data,top);
        top=element;
        size++;
    }

    public T pop() throws Exception {
        if(size==0){
            throw new Exception();
        }
        T data=top.getData();
        top=top.getNext();
        size--;
        return data;
    }

    public T peek() throws Exception {
        if(size==0){
            throw new Exception();
        }
      return top.getData();
    }

    public int getSize(){
        return size;
    }

    public boolean isFull(){
        return size==MAX_SIZE;
    }

    public boolean isEmpty(){
        return size==0;
    }
}

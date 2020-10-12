package org.stack.impl;

public class MainMethod {
    public static void main(String[] args) throws Exception {
        Stack<String> stack=new Stack<>();
        System.out.println("PUSHING A DATA INTO STACK");
        stack.push("Data");
        System.out.println("STACK SIZE AFTER PUSHING: "+stack.getSize());
        System.out.println("PEEK ELEMENT AFTER PUSHING: "+stack.peek());
        System.out.println("STACK-IS EMPTY STATUS: "+stack.isEmpty());
        System.out.println("STACK-IS FULL STATUS: "+stack.isFull());
        System.out.println("STACK-POP: "+stack.pop());
        System.out.println("STACK SIZE AFTER POP: "+stack.getSize());
        System.out.println("STACK-IS EMPTY STATUS: "+stack.isEmpty());
        System.out.println("STACK-IS FULL STATUS: "+stack.isFull());
    }
}

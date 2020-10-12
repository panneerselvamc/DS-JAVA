package org.stack.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class ParenthesisValidation {

    static HashMap<Character,Character> closingHashMap=new HashMap<>();
    static  Set<Character> openingSet=new HashSet<>();
    static {
       closingHashMap.put('}', '{');
       closingHashMap.put(')', '(');
       closingHashMap.put(']', '[');
       openingSet.addAll(closingHashMap.values());
    }
    public boolean validateParanthesis(String eqn){
        char[] charArray=eqn.toCharArray();
        Stack<Character> stack=new Stack<>();

        for(int i=0;i<charArray.length;i++){
            char currentChar=charArray[i];
            if(openingSet.contains(currentChar)){
                stack.push(currentChar);
            }
            if(closingHashMap.containsKey(currentChar)){
                Character lastItem=stack.pop();
                if(lastItem!=closingHashMap.get(currentChar)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ParenthesisValidation parenthesisValidation =new ParenthesisValidation();
        System.out.println(parenthesisValidation.validateParanthesis("a+b(c*d)["));
    }

}

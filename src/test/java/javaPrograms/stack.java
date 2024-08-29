package javaPrograms;

import java.util.Stack;

public class stack {

    public static void main(String[] args) {

        String str = "{(a())}";
        System.out.println(balance(str));

    }
    public static boolean balance(String str){
        Stack stack = new Stack();

        for(char ch : str.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }
            if(stack.isEmpty()){
                return false;
            }

            switch (ch){
                case ')':
                    if((char) stack.pop()!='(')
                        return false;
                    break;
                case '}':
                    if((char) stack.pop()!='{')
                        return false;
                    break;
                case ']':
                    if((char) stack.pop()!='[')
                        return false;
                    break;
            }
        }
        return stack.isEmpty();
    }
}

package Stackdemo;


import java.util.Stack;
import java.util.Vector;

public class StackDemo {

    public static void main(String[] args) {

        Stack<String> stringStack = new Stack<>();
        stringStack.push("Test");
        System.out.println(stringStack.pop());


    }

}

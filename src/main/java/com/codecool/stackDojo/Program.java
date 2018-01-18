package com.codecool.stackDojo;

public class Program {

    public static void main(String[] args) {
        MyStack myStack = new MyStack(6);
        myStack.push("A");
        myStack.push("B");
        myStack.push("C");
        myStack.push("D");
        myStack.push("E");
        System.out.println(myStack.toString());
        System.out.println(myStack.getActualStackSize());
        myStack.push("D");
        System.out.println(myStack.getActualStackSize());
        myStack.push("D");
    }
}

package com.test;

public class Main {

    public static void main(String[] args) {

        LinkedList myLinkedlist = new LinkedList();

        myLinkedlist.addLast(1);
        myLinkedlist.addLast(2);
        myLinkedlist.addLast(3);

        myLinkedlist.display();

        System.out.println();
        System.out.println(myLinkedlist.getAt(0));

        myLinkedlist.removeAt(2);
        myLinkedlist.display();
    }

}
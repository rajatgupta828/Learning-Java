package com.rajat.ListAndArrays.LinkedLists.NativeImplementation;

public class LinkedList {
    Node head;

    public void insert(int data){
        Node node = new Node();
        node.setData(data);
        node.setNext(null);

        if(head == null){
            head = node;
        }else{
            Node node1 = head;
            while (node1.getNext() != null){
                node1 = node1.getNext();
            }
            node1.setNext(node);

        }
    }

    public void show(){
        Node node = head;

        while (node.getNext() != null){
            System.out.println("Data inserted in Linked List" + node.getData());
            node = node.getNext();
        }
    }
}

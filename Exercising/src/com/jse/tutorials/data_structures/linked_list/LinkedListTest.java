package com.jse.tutorials.data_structures.linked_list;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.head().setData(0);
        linkedList.appendToTail(new Node<Integer>(101));
        linkedList.appendToTail(new Node<Integer>(201));
        linkedList.appendToTail(new Node<Integer>(301));
        linkedList.appendToTail(new Node<Integer>(401));
        
        LinkedList<String> linkedList2 = new LinkedList<>();
        linkedList2.head().setData("first");
        
        LinkedList<Double> linkedList3 = new LinkedList<>();
        Node<Double> firstNode = new Node<Double>(1.23);
        Node<Double> secondNode = new Node<Double>(4.56);
        Node<Double> thirdNode = new Node<Double>(7.89);
        linkedList3.appendToTail(firstNode);
        linkedList3.appendToTail(secondNode);
        linkedList3.appendToTail(thirdNode);
        //thirdNode.setNext(firstNode);
        linkedList3.appendToTail(secondNode);
        
        if (linkedList.hasCycle()) {
            System.out.println("linkedList has cycle");
        } else {
            System.out.println(linkedList);
        }
        
        if (linkedList2.hasCycle()) {
            System.out.println("linkedList2 has cycle");
        } else {
            System.out.println(linkedList2);
        }
        
        if (linkedList3.hasCycle()) {
            System.out.println("linkedList3 has cycle");
        } else {
            System.out.println(linkedList3);
        }
        
        if (new LinkedList<>().hasCycle()) {
            System.out.println("linkedList3 has cycle");
        } else {
            System.out.println(new LinkedList<>());
        }
    }
}

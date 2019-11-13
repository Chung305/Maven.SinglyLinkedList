package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T> {
    private Node head;
    private Node tail;
    private static Integer size;

    public SinglyLinkedList(T head){
       this.head = new Node<T>(head);
       size = 1;
    }

    public void add(T data){
        Node<T> newTail = new Node<T>(data);
        if(size.equals(1)){
            head.setNext(newTail);
            tail = newTail;
        }
        else{
            tail.setNext(newTail);
            tail = tail.getNext();
        }
        size++;
    }


}

package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T> {
    private Node<T> head;
    private static Integer size = 0;

    public SinglyLinkedList(T head){
       this.head = new Node<T>(head);
       size = 1;
    }

    public void add(Node<T> data){
        data.setNext(head);
        head = data;
        size++;
    }

    public Boolean remove(T node){
        Node current = this.head;
        Node previous = null;

        while(current !=  null){
            if(current.getData() == node){
                previous.setNext(current.getNext());
                size--;
                return true;
            }
            previous = current;
            current = current.getNext();
        }
        return false;
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public static Integer getSize() {
        return size;
    }

    public static void setSize(Integer size) {
        SinglyLinkedList.size = size;
    }
}

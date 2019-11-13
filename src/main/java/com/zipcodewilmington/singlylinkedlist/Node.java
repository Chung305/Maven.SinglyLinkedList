package com.zipcodewilmington.singlylinkedlist;

public class Node<T> {
    private T data;
    private Node<T> next;

    public Node(T data){
        this.data = data;
        this.next = null;
    }

    public T getData(){
        return this.data;

    }

    public void setNext(Node<T> next){
        this.next = next;

    }

    public Node getNext(){
        return  this.next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}

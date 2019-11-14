package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T> {
    private Node head = null;
    private Integer size;

    public SinglyLinkedList(T data){
       this.head = new Node<T>(data);
       this.size = 0;
    }
    public SinglyLinkedList(){
        this.size = 0;
    }

    /////pain in the ass!!!!!
    //adds a node to the last node;
    public void add(T data){
        if(head != null){
            Node current = head;
            while(current.getNext() != null){
                if(current.getNext() == null){
                    current.setNext(new Node<T>(data));
                    size++;

                }
                current = current.getNext();
            }
        }
        else{
            this.head = new Node<T>(data);
            size++;
        }
    }

    public Boolean remove(Integer index){
        Node current = this.head;
        Integer counter = 0;

        while(current != null){
            if(index.equals(0)){
                this.head = current.getNext();
                size--;
                return true;
            }
            else if(counter == index - 1){


            }
        }





        return false;

    }
    public Boolean contains(T data){
        Node current = this.head;

        while(current != null){
            if(current.getData() == data){
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public Integer find(T data){
        Node current = this.head;
        Integer index = 0;


        while(current != null){
            if(current.getData() == data)
                return index;

            current = current.getNext();
            index++;
        }

        return -1;
    }

    public Node<T> getByIndex(Integer index) {

        Node current = this.head;
        Integer currentIndex = 0;

        while(current != null){
            if(currentIndex.equals(index))
                return current;

            current = current.getNext();
            currentIndex++;
        }

        return null;
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public Integer getSize() {
        return size;
    }

}

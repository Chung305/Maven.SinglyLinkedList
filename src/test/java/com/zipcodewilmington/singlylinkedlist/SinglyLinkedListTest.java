package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {
    @Test
    public void testConstructor(){
        //Given
        String expected = "Chung";
        SinglyLinkedList<String> linkedList = new SinglyLinkedList<String>(expected);


        Assert.assertNull(linkedList.getHead().getNext());
        Assert.assertEquals(expected, linkedList.getHead().getData());

    }

    @Test
    public void testAdd(){
        //given
        String expected = "Chung";
        String dataToAdd = "Chung2.0";
        SinglyLinkedList<String> linkedList = new SinglyLinkedList<String>(expected);

        //when
        linkedList.add(new Node<String>(dataToAdd));

        //then
        Assert.assertEquals(dataToAdd, linkedList.getHead().getData());
        Assert.assertEquals(expected, linkedList.getHead().getNext().getData());
    }

    @Test
    public void testRemove(){
        //given
        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<Integer>(0);
        Integer remove = 3;

        for(int i = 1; i < 5; i++)
            linkedList.add(new Node<Integer>(i));

        //when
        Boolean removed = linkedList.remove(remove);

        //then
        Assert.assertTrue(removed);
    }

    @Test
    public void testContains(){

    }


}

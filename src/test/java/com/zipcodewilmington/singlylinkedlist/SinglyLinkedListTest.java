package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {
    @Test
    public void testConstructor(){
        String expected = "Chung";
        SinglyLinkedList<String> linkedList = new SinglyLinkedList<String>(expected);

        Assert.assertEquals(expected, linkedList.getHead().getData());
    }

    @Test
    public void testAdd(){
        //given
        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<Integer>();

        //when
        linkedList.add(100);
        linkedList.add(200);
        Integer expected = 1;

        //then
        Assert.assertEquals(expected, linkedList.getSize());

    }

    @Test
    public void testRemove(){
        //given
        SinglyLinkedList<String> linkedList = new SinglyLinkedList<String>();
        linkedList.add("Chung");
        linkedList.add("Sian");
        linkedList.add("Eric");

        //when
        Boolean remove = linkedList.remove(2);

        //then
        Assert.assertTrue(remove);

    }





}

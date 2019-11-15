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
        linkedList.add(500);
        linkedList.add(90);
        Integer expected = 4;

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

    @Test
    public void testRemove2(){
        //given
        SinglyLinkedList<String> linkedList = new SinglyLinkedList<String>();
        linkedList.add("Chung");
        linkedList.add("Sian");
        linkedList.add("Eric");

        //when
        linkedList.remove(2);

        //then
        Assert.assertFalse(linkedList.contains("Sian"));
    }

    @Test
    public void testContain(){
        //given
        SinglyLinkedList<String> linkedList = new SinglyLinkedList<String>();

        //when
        linkedList.add("Chung");
        linkedList.add("Sian");
        linkedList.add("Eric");
        linkedList.add("Brian");
        System.out.println(linkedList.toString());
        //then
        Assert.assertTrue(linkedList.contains("Chung"));
        Assert.assertTrue(linkedList.contains("Sian"));
        Assert.assertTrue(linkedList.contains("Eric"));

    }

    @Test
    public void testFind(){
        //given
        SinglyLinkedList<String> linkedList = new SinglyLinkedList<String>();

        //when
        linkedList.add("Chung");
        linkedList.add("Sian");
        linkedList.add("Eric");

        //then
        Assert.assertEquals((Integer)1, linkedList.find("Chung"));
        Assert.assertEquals((Integer)3, linkedList.find("Eric"));
    }

    @Test
    public void testSize(){
        //given
        SinglyLinkedList<String> linkedList = new SinglyLinkedList<String>();

        //when
        linkedList.add("Chung");
        linkedList.add("Sian");
        linkedList.add("Eric");
        Integer expected = 3;

        //then
        Assert.assertEquals(expected, linkedList.getSize());
    }

    @Test
    public void testGetByIndex(){
        //given
        SinglyLinkedList<String> linkedList = new SinglyLinkedList<String>();

        //when
        linkedList.add("Chung");
        linkedList.add("Sian");
        linkedList.add("Eric");

        Assert.assertEquals("Sian", linkedList.getByIndex(2));
    }

    @Test
    public void testClone(){
        //given
        SinglyLinkedList<String> linkedList = new SinglyLinkedList<String>();
        linkedList.add("Chung");
        linkedList.add("Sian");
        linkedList.add("Eric");

        //when
        SinglyLinkedList<String> linkedList1 = null;
        try{
            linkedList1 = (SinglyLinkedList<String>) linkedList.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }

        //then
        Assert.assertEquals(linkedList.toString(), linkedList1.toString());


    }
    ///Check the reverse method<<<<<<<<<<
    @Test
    public void testReverse(){
        //given
        SinglyLinkedList<String> linkedList = new SinglyLinkedList<String>();
        linkedList.add("Chung");
        linkedList.add("Sian");
        linkedList.add("Eric");



        //then
        Assert.assertEquals("Eric", linkedList.reverse(linkedList.getHead()).getData());
    }

    @Test
    public void testSort(){
        //given
        SinglyLinkedList<String> linkedList = new SinglyLinkedList<String>();
        linkedList.add("Chung");
        linkedList.add("Sianss");
        linkedList.add("Eric");

        System.out.println(linkedList.getHead().toString());

        linkedList.sort();

        System.out.println(linkedList.getHead().toString());
    }





}

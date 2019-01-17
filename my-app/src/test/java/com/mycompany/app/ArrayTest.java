package com.mycompany.app;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class ArrayTest 
{
    @Test
    public void testArrayDeclare()
    {
        int[] myArray; //declare array doesn't create the object yet
        myArray = new int[10]; // creating numbers is a 10-element array
        myArray = new int[20]; // creating now myArray is 20-element array
 
        //  creating now myArray is 20-element array
        System.out.print("I AM HERE"+myArray.getClass().getName());
        Assert.assertEquals(myArray.length, 20);
    }

    @Test
    public void TestSingleDimensionArray()
    {
        //declare an array, the brackets are following type, this may be different from Java
        int[] myArray;
        myArray = new int[10]; // numbers is a 10-element array
        myArray = new int[20]; // now myArray is 20-element array

    }
}

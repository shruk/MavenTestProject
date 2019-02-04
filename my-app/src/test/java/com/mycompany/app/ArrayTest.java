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

    @Test
    public void TestArrayInitialization()
    {
        int[] myArray;
        myArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        String[] yourArray;
        yourArray = new String[] { "mama", "baba", "kid" };
        Assert.assertEquals(myArray[0], 1);
        
        for (int j : myArray)
        { System.out.println("Element in Array: "+j); }
    }

    @Test
    public void TestTwoDimensionArray()
    {
        int[][] myArray;
        myArray = new int[10][10]; // numbers is a 10X10 array
        myArray = new int[20][20]; // now myArray is 20X20 array
        int[][] n4 = new int[][]
        {
            {1, 2},
            {3, 4},
            {5, 6}
        };
        String[][] family = new String[][]
        {
            {"Mike", "Amy"},
            {"Mary", "Albert"}
        };
        //omit size of the array
        int[][] numbers = new int[][]
        {
            {1, 2},
            {3, 4},
            {5, 6}
        };
        String[][] siblings = new String[][]
        {
            {"Mike", "Amy"},
            {"Mary", "Albert"}
        };
        //omit new operator if initinalizer is provided
        int[][] numbers2 =
        {
            {1, 2},
            {3, 4},
            {5, 6}
        };
        String[][] siblings2 =
        {
            {"Mike", "Amy"},
            {"Mary", "Albert"}
        };
       assert numbers[1][1] == 4;

    }


    @Test
    public void TestMultiDimensionArray()
    {
        //declare an array, the brackets are following type, this may be different from Java
        int[][][] myArray;
        myArray = new int[10][10][10]; // numbers is a 10X10X10 array
        myArray = new int[20][20][20]; // now myArray is 20X20X20 array

    }

    @Test
    public void TestArrayOfArray()
    {
        //declare an array, the brackets are following type, this may be different from Java
        byte[][] myArray;
        myArray=new byte[5][];
        for (int x = 0; x < myArray.length; x++)
        {
            myArray[x] = new byte[4];
        }

        int[][] n7 = new int[][] { new int[] { 2, 4, 6 }, new int[] { 1, 3, 5, 7, 9 } };
        //omit the size of the first array
        int[][] numbers = new int[][] { new int[] { 2, 3, 4 }, new int[] { 5, 6, 7, 8, 9 } };
        //omit new
        int[][] numbers2 = { new int[] { 2, 3, 4 }, new int[] { 5, 6, 7, 8, 9 } };
    }





}

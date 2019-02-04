package com.mycompany.app;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class InitializerTest 
{

public class Cat
{
    // Auto-implemented properties.
    private int Age;
    public final int getAge()
    {
        return Age;
    }
    public final void setAge(int value)
    {
        Age = value;
    }
    private String Name;
    public final String getName()
    {
        return Name;
    }
    public final void setName(String value)
    {
        Name = value;
    }
}

@Test		
public final void TestObjectInitializer()
{ //use an object initializer with a named type
    Cat cat = new Cat();
    cat.Age = 10;
    cat.Name = "Fluffy";

}

@Test
public void TestCollectionInitializer()
{
    ArrayList<Integer> digits = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
    ArrayList<Integer> digits2 = new ArrayList<Integer>(Arrays.asList(0 + 1, 12 % 3, 88));
    Cat tempVar = new Cat();
    tempVar.Name = "Sylvester";
    tempVar.Age = 8;
    Cat tempVar2 = new Cat();
    tempVar2.Name = "Whiskers";
    tempVar2.Age = 2;
    ArrayList<Cat> cats = new ArrayList<Cat>(Arrays.asList(tempVar, tempVar2, null));    
}






}

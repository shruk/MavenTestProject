package com.mycompany.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class BitwiseTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        int number1 = 12, number2 = 25, result;
    	
    	result = number1 | number2;
    	System.out.println(result);
    }
}

package com.mycompany.app;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class BitwiseTest 
{

    final static Logger logger = Logger.getLogger(BitwiseTest.class);

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        int number1 = 12, number2 = 25, result;
    	
    	result = number1 | number2;
    	logger.info(result);
    }
}

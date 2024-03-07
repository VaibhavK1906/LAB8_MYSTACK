package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{

    public void testApp()
    {
        MyStack stack = new MyStack();

        assertEquals(0,stack.size());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.size());
        Object popObj = stack.pop();
        assertEquals(3,popObj);
    }
}

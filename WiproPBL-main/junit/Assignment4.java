package com.wipro.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import com.wipro.task.DailyTasks;

/*
 * Question 1:
 * Create a class named TestStringConcat to test the functionality of doStringConcat method 
 * [hint: use assertEquals method]
 */
public class Assignment4 {

    @Test
    public void testDoStringConcat() {
        DailyTasks dailyTasks = new DailyTasks();
        
        // Verifies doStringConcat concatenates two strings with a space in between
        String actual = dailyTasks.doStringConcat("Hello", "World");
        String expected = "Hello World";
        
        assertEquals(expected, actual);
    }
}
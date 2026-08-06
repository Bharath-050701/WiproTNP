package com.wipro.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import com.wipro.task.DailyTasks;

/*
 * Question 2:
 * Create a class named TestCheckPresence to test the functionality of checkPresence method 
 * [hint: use assertTrue and assertFalse methods]
 */
public class Assignment3 {

    @Test
    public void testCheckPresence() {
        DailyTasks dailyTasks = new DailyTasks();
        
        // Verifies checkPresence returns true when the substring exists
        assertTrue(dailyTasks.checkPresence("Hello World", "World"));
        
        // Verifies checkPresence returns false when the substring does not exist
        assertFalse(dailyTasks.checkPresence("Hello World", "Java"));
    }
}
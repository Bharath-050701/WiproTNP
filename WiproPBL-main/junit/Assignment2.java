/*
 * QUESTION 1:
 * Create a class named TestSort to test the functionality of the 
 * sortValues method [hint: use assertArrayEquals method]
 */

package com.wipro.test;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
import com.wipro.task.DailyTasks;

public class Assignment2 {

    @Test
    public void testSortValues() {
        DailyTasks task = new DailyTasks();
        
        int[] input = {5, 2, 8, 1, 3};
        int[] expected = {1, 2, 3, 5, 8};
        
        // Calling sortValues and storing the result
        int[] actual = task.sortValues(input);
        
        // Asserting that expected and actual arrays are equal
        assertArrayEquals(expected, actual);
    }
}
/*
 * QUESTION 1:
 * Create a Project named JunitLearning
 * 1. Create a package named com.wipro.task
 * 2. Copy the given class into the com.wipro.task package:
 * 
 *    package com.wipro.task;
 *    import java.util.Arrays;
 *    
 *    public class DailyTasks {
 *        public String doStringConcat (String s1, String s2) {
 *            return s1+" "+s2;
 *        }
 *        public int[] sortValues(int arr[]){
 *            Arrays.sort(arr);
 *            return arr;
 *        }
 *        public boolean checkPresence(String str,String a){
 *            return str.contains(a);
 *        }
 *    }
 * 
 * 3. Create a new package called com.wipro.test;
 * 4. Create a class named TestStringConcat to test the functionality of doStringConcat method [hint: use assertEquals method]
 */

package com.wipro.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.wipro.task.DailyTasks;

public class Assignment1 {

    @Test
    public void testDoStringConcat() {
        DailyTasks task = new DailyTasks();
        
        // Testing doStringConcat method
        String result = task.doStringConcat("Hello", "World");
        
        // Asserting that "Hello" + " " + "World" equals "Hello World"
        assertEquals("Hello World", result);
    }
}
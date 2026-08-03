package com.mile1.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentTest {

    private StudentReport studentReport;
    private StudentService studentService;

    @Before
    public void setUp() {
        studentReport = new StudentReport();
        studentService = new StudentService();
    }

    // TC1: Calculate the grade for valid objects – Check for A grade computation.
    @Test
    public void testGradeA() throws Exception {
        Student s = new Student("John", new int[] {90, 95, 90});
        String actual = studentReport.validate(s);
        assertEquals("A", actual);
    }

    // TC2: Calculate the grade for valid objects – Check for D grade computation.
    @Test
    public void testGradeD() throws Exception {
        Student s = new Student("Alex", new int[] {40, 40, 50});
        String actual = studentReport.validate(s);
        assertEquals("D", actual);
    }

    // TC3: Calculate the grade for valid objects – Check for F grade computation.
    @Test
    public void testGradeF() throws Exception {
        Student s = new Student("Mark", new int[] {30, 80, 90});
        String actual = studentReport.validate(s);
        assertEquals("F", actual);
    }

    // TC4: If the Object is null, throw NullStudentException().
    @Test(expected = NullStudentException.class)
    public void testNullStudentException() throws Exception {
        studentReport.validate(null);
    }

    // TC5: If the Name is null, throw NullNameException().
    @Test(expected = NullNameException.class)
    public void testNullNameException() throws Exception {
        Student s = new Student(null, new int[] {80, 80, 80});
        studentReport.validate(s);
    }

    // TC6: If the Marks array is null, throw NullMarksArrayException().
    @Test(expected = NullMarksArrayException.class)
    public void testNullMarksArrayException() throws Exception {
        Student s = new Student("Paul", null);
        studentReport.validate(s);
    }

    // TC7: Test findNumberOfNullName function.
    @Test
    public void testFindNumberOfNullName() {
        Student[] data = new Student[] {
            new Student(null, new int[] {50, 60, 70}),
            new Student("David", new int[] {60, 70, 80}),
            new Student(null, new int[] {40, 50, 60})
        };
        int actual = studentService.findNumberOfNullName(data);
        assertEquals(2, actual);
    }

    // TC8: Test findNumberOfNullObjects function.
    @Test
    public void testFindNumberOfNullObjects() {
        Student[] data = new Student[] {
            null,
            new Student("Sam", new int[] {60, 70, 80}),
            null
        };
        int actual = studentService.findNumberOfNullObjects(data);
        assertEquals(2, actual);
    }

    // TC9: Test findNumberOfNullMarks function.
    @Test
    public void testFindNumberOfNullMarks() {
        Student[] data = new Student[] {
            new Student("Roy", null),
            new Student("Leo", new int[] {60, 70, 80}),
            new Student("Tom", null)
        };
        int actual = studentService.findNumberOfNullMarks(data);
        assertEquals(2, actual);
    }
}
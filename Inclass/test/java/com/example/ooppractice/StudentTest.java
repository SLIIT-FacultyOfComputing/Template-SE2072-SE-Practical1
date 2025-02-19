package com.example.ooppractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testConstructorAndGetters() {
        Student s = new Student("Alice", 18, "CS");
        assertEquals("Alice", s.getName());
        assertEquals(18, s.getAge());
        assertEquals("CS", s.getDepartment());
    }

    @Test
    void testDetermineYearOfStudy() {
        Student s = new Student("Bob", 19, "Mathematics");
        // Example tests once 'determineYearOfStudy' is implemented
        assertEquals("Freshman", s.determineYearOfStudy(1));
        assertEquals("Senior", s.determineYearOfStudy(4));
        assertEquals("Invalid year", s.determineYearOfStudy(5));
    }

    @Test
    void testIsEligibleForExam() {
        Student s = new Student("Carol", 20, "Literature");
        // e.g., if attendance >= 75 -> true
        assertTrue(s.isEligibleForExam(80));
        assertFalse(s.isEligibleForExam(70));
    }

    @Test
    void testGetStudentInfo() {
        Student s = new Student("Dave", 21, "Chemistry");
        String info = s.getStudentInfo();
        assertTrue(info.contains("Dave"), "Should contain the name");
        assertTrue(info.contains("21"), "Should contain the age");
        assertTrue(info.contains("Chemistry"), "Should contain the department");
    }
}

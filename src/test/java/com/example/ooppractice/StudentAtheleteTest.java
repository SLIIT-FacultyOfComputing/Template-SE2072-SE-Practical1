package com.example.ooppractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentAthleteTest {

    @Test
    void testConstructorAndGetters() {
        StudentAthlete sa = new StudentAthlete("Eve", 22, "Engineering", "Basketball");
        assertEquals("Eve", sa.getName());
        assertEquals(22, sa.getAge());
        assertEquals("Engineering", sa.getDepartment());
        assertEquals("Basketball", sa.getSport());
    }

    @Test
    void testIsEligibleForExamOverridden() {
        // Suppose StudentAthlete has different logic
        StudentAthlete sa = new StudentAthlete("Frank", 23, "Biology", "Football");
        // Adjust these tests according to your custom logic
        assertTrue(sa.isEligibleForExam(80));
        assertFalse(sa.isEligibleForExam(74));
    }

    @Test
    void testGetStudentInfoOverridden() {
        StudentAthlete sa = new StudentAthlete("Gina", 24, "Art", "Tennis");
        String info = sa.getStudentInfo();
        // Should contain everything that Student's info has,
        // plus the sport info
        assertTrue(info.contains("Gina"));
        assertTrue(info.contains("24"));
        assertTrue(info.contains("Art"));
        assertTrue(info.contains("Tennis"));
    }
}

package com.example.ooppractice;

public class Student {

    private String name;
    private int age;
    private String department;

    public Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    /**
     * Example method using switch-case:
     *  1 -> "Freshman"
     *  2 -> "Sophomore"
     *  3 -> "Junior"
     *  4 -> "Senior"
     *  else -> "Invalid year"
     */
    public String determineYearOfStudy(int year) {
        // TODO: implement using switch-case
        return null;
    }

    /**
     * Example method using if-else to determine exam eligibility.
     * e.g. if attendance >= 75, return true; else false.
     */
    public boolean isEligibleForExam(int attendancePercentage) {
        // TODO: implement using if-else
        return false;
    }

    /**
     * Use StringBuilder to build a multi-line string of student's info.
     */
    public String getStudentInfo() {
        // TODO: implement using StringBuilder
        return "Student info not yet implemented.";
    }

}

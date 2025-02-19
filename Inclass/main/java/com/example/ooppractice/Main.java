package com.example.ooppractice;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the OOP Practice Project!");

        // Example usage (students can replace with their own logic)
        Student student = new Student("Alice", 18, "Computer Science");
        System.out.println(student.getStudentInfo());

        StudentAthlete athlete = new StudentAthlete("Bob", 20, "Physics", "Soccer");
        System.out.println(athlete.getStudentInfo());

        // Run some sample logic
        // For instance, check exam eligibility or year of study
        System.out.println("Is Alice eligible for the exam? " +
                student.isEligibleForExam(80)); // example condition

        System.out.println("Alice's year of study: " +
                student.determineYearOfStudy(1));

        // The StudentAthlete may have different logic for eligibility
        System.out.println("Is Bob eligible for the exam? " +
                athlete.isEligibleForExam(80));
    }
}

package com.example.ooppractice;

public class StudentAthlete extends Student {

    private String sport;

    public StudentAthlete(String name, int age, String department, String sport) {
        super(name, age, department);
        this.sport = sport;
    }

    public String getSport() {
        return sport;
    }

    /**
     * Override isEligibleForExam.
     * For instance, maybe StudentAthletes have a different attendance requirement
     * or an additional condition (like "must attend practices").
     */
    @Override
    public boolean isEligibleForExam(int attendancePercentage) {
        // TODO: implement custom logic (inheritance/polymorphism demonstration)
        return super.isEligibleForExam(attendancePercentage);
    }

    /**
     * Override getStudentInfo() to include the sport info.
     */
    @Override
    public String getStudentInfo() {
        // TODO: use a StringBuilder to append sport information
        return super.getStudentInfo();
    }
}

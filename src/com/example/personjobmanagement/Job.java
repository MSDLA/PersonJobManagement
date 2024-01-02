package com.example.personjobmanagement;

public class Job {
    private String title;
    private double salary;

    public Job(String title, double salary) {
        this.title = title;
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public double getSalary() {
        return salary;
    }
}


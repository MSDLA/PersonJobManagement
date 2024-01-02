package com.example.personjobmanagement;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("Anna", 30);
        Job job = new Job("Engineer", 70000);

        System.out.println(person.getName() + " is " + person.getAge() + " years old.");
        System.out.println("She works as an " + job.getTitle() + " with a salary of " + job.getSalary());
    }
}



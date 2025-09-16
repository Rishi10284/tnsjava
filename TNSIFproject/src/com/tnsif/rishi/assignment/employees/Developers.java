package com.tnsif.rishi.assignment.employees;

public class Developers extends Employee {
	String programmingLanguage;  // package-private (default)

    public Developers (String name, int id, double salary, String language) {
        super(name, id, salary, "Developer");
        this.programmingLanguage = language;
    }

    public void showDeveloperDetails() {
        // Accessing default (employeeId) inside same package
        System.out.println("Developer ID: " + employeeId + 
                           ", Salary: " + salary + 
                           ", Language: " + programmingLanguage);
    }

}

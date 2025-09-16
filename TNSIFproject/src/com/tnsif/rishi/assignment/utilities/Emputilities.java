package com.tnsif.rishi.assignment.utilities;


import com.tnsif.rishi.assignment.employees.*;

/**
 * Utility class demonstrating access across packages.
 */
public class Emputilities {

    // Method to check salary (protected can be accessed via inheritance or same package)
    public void printEmployeeRole(Employee emp) {
        System.out.println("Employee Role: " + emp.role); // public → accessible
        // Cannot access emp.salary directly here (protected, diff package, not subclass)
        // Cannot access emp.employeeId (default → package-private)
        // Cannot access emp.name (private)
    }

    public void printManagerInfo(Managers mgr) {
        mgr.showManagerDetails(); // allowed, accessing subclass method
    }

    public void printDeveloperInfo(Developers dev) {
        dev.showDeveloperDetails(); // allowed
    }
}


package com.tnsif.rishi.assignment;
import com.tnsif.rishi.assignment.employees.*;
import com.tnsif.rishi.assignment.utilities.*;

/**
 * Main class to test Employees, Manager, Developer, and Utilities
 */

public class Mainassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Managers m1 = new Managers("Alice", 101, 80000, 5);
	        Developers d1 = new Developers("Bob", 102, 60000, "Java");

	        Emputilities utils = new Emputilities();

	        // Show using Employee method
	        m1.showEmployeeInfo();
	        d1.showEmployeeInfo();

	        // Show subclass-specific methods
	        m1.showManagerDetails();
	        d1.showDeveloperDetails();

	        // Show via utilities class
	        utils.printEmployeeRole(m1);
	        utils.printManagerInfo(m1);
	        utils.printDeveloperInfo(d1);
	    }

	}

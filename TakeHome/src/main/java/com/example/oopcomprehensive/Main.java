package com.example.oopcomprehensive;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create a Company with a name
        Company company = new Company("TechCorp");

        // Scanner for console input
        Scanner scanner = new Scanner(System.in);
        String choice;

        // Basic menu-driven loop
        do {
            System.out.println("\n=== Employee Management Menu ===");
            System.out.println("1. Add Department");
            System.out.println("2. Remove Department");
            System.out.println("3. Add Employee to a Department");
            System.out.println("4. Remove Employee by ID");
            System.out.println("5. View Department Salary Total");
            System.out.println("6. View Company Total Payroll");
            System.out.println("7. Print All Departments & Employees");
            System.out.println("8. Sample Usage (Basic Tests)");
            System.out.println("X. Exit");
            System.out.print("Enter choice: ");

            choice = scanner.nextLine().trim();

            switch (choice.toUpperCase()) {
                case "1":
                    System.out.print("Enter new Department name: ");
                    String deptName = scanner.nextLine();
                    Department newDept = new Department(deptName);
                    company.addDepartment(newDept);
                    System.out.println("Department '" + deptName + "' added.");
                    break;

                case "2":
                    System.out.print("Enter Department name to remove: ");
                    String removeDept = scanner.nextLine();
                    company.removeDepartment(removeDept);
                    System.out.println("Attempted to remove Department '" + removeDept + "'.");
                    break;

                case "3":
                    // Add an Employee to a Department
                    // (In real usage, you'd also gather data for which subclass of Employee,
                    //  e.g., FullTimeEmployee, PartTimeEmployee, etc. Then create it accordingly.)
                    System.out.print("Enter Department name to add employee: ");
                    String targetDept = scanner.nextLine();

                    // For simplicity, let's ask for minimal data
                    System.out.print("Enter Employee Name: ");
                    String empName = scanner.nextLine();
                    System.out.print("Enter Employee ID: ");
                    int empId = Integer.parseInt(scanner.nextLine());

                    // Here you’d decide or ask the user if it’s FullTime, PartTime, Intern, etc.
                    // e.g.:
                    // Employee e = new FullTimeEmployee(empName, empId, ...);
                    // For now, let's just do a minimal placeholder:
                    Employee e = new Intern(empName, empId); // Example
                    // Then you'd find the Department, and add:
                    Department d = findDepartmentByName(company, targetDept);
                    if (d != null) {
                        d.addEmployee(e);
                        System.out.println("Employee '" + empName + "' added to department '" + targetDept + "'.");
                    } else {
                        System.out.println("Department not found!");
                    }
                    break;

                case "4":
                    // Remove an Employee by ID
                    System.out.print("Enter Department name: ");
                    String deptToRemoveEmp = scanner.nextLine();
                    System.out.print("Enter Employee ID to remove: ");
                    int removeId = Integer.parseInt(scanner.nextLine());

                    Department deptObj = findDepartmentByName(company, deptToRemoveEmp);
                    if (deptObj != null) {
                        deptObj.removeEmployeeById(removeId);
                        System.out.println("Attempted to remove employee with ID " + removeId);
                    } else {
                        System.out.println("Department not found!");
                    }
                    break;

                case "5":
                    // View Department Salary Total
                    System.out.print("Enter Department name: ");
                    String deptToView = scanner.nextLine();
                    Department deptViewObj = findDepartmentByName(company, deptToView);
                    if (deptViewObj != null) {
                        double total = deptViewObj.getDepartmentSalaryTotal();
                        System.out.println("Total monthly salary for '" + deptToView + "': " + total);
                    } else {
                        System.out.println("Department not found!");
                    }
                    break;

                case "6":
                    // View Company total payroll
                    double payroll = company.getTotalPayroll();
                    System.out.println("Total company payroll: " + payroll);
                    break;

                case "7":
                    // Print all departments
                    String output = company.printAllDepartments();
                    System.out.println(output);
                    break;

                case "8":
                    // Run a simple demonstration of “test-like” usage
                    runBasicTests(company);
                    break;

                case "X":
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        } while (!choice.equalsIgnoreCase("X"));

        scanner.close();
    }

    /**
     * Helper method to locate a Department within the Company by name.
     * This might live in the Company class if you prefer.
     */
    private static Department findDepartmentByName(Company company, String deptName) {
        // If you had a getDepartments() method, you could iterate and match
         for (Department d : company.getDepartments()) {
            if (d.getName().equalsIgnoreCase(deptName)) {
                return d;
            }
         }
        // In the skeleton, that method might not exist yet. So just a placeholder:
        return null;
    }

    /**
     * A minimal demonstration that acts as a "basic test."
     * In real usage, you might do this in JUnit, but it can also serve
     * as an in-program check of your logic and OOP features.
     */
    private static void runBasicTests(Company company) {
        System.out.println("\n--- Running Basic Demo/Test ---");

        // Create a department
        Department devDept = new Department("Development");
        company.addDepartment(devDept);

        // Create a couple of employees
        FullTimeEmployee fte = new FullTimeEmployee("Alice", 101 /*, baseSalary, annualBonus */);
        PartTimeEmployee pte = new PartTimeEmployee("Bob", 102 /*, hourlyRate, hoursWorked */);

        devDept.addEmployee(fte);
        devDept.addEmployee(pte);

        // Check total payroll
        double deptTotal = devDept.getDepartmentSalaryTotal();
        System.out.println("Development Dept Salary Total: " + deptTotal);

        // Print out department details
        System.out.println(devDept.printAllEmployees());

        // Attempt to remove one employee
        devDept.removeEmployeeById(101);

        // Show results after removal
        System.out.println("\nAfter removing employee 101:");
        System.out.println(devDept.printAllEmployees());

        System.out.println("--- End of Basic Demo/Test ---\n");
    }
}

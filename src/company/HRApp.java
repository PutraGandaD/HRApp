/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package company;

/**
 *
 * @author putragandadewata
 */
public class HRApp {
    public static void main(String[] args) {
        // 1. Create a print statement to say the app is starting
        System.out.println("HRApp Starts");
        
        // 2. Create a New Department 
        Department dep1 = new Department("IT Support Department");
        
        // 3. Call toString() method to print the Information about department
        System.out.println(dep1);
        
        // List of Employee
        Employee e1 = new Employee(123, "Putra Ganda", 13.5);
        Employee e2 = new Employee(124, "Josh", 12.5);
        Employee e3 = new Employee(125, "Steve", 14.0);
        Employee e4 = new Employee(126, "Arash", 14.0);
        Employee e5 = new Employee(127, "Ali", 14.0);
        Employee e6 = new Employee(128, "Yousef", 14.0);
        Employee e7 = new Employee(129, "Jack", 14.0);
        Employee e8 = new Employee(130, "Casey", 14.0);
        Employee e9 = new Employee(131, "Chloe", 14.0);
        Employee e10 = new Employee(132, "Cassandra", 14.0);
        Employee e11 = new Employee(133, "Alex", 14.0);
        Employee e12 = new Employee(134, "Alexa", 14.0);
        
        Employee emp[] = {e1, e2, e3, e4, e5, e6, e7, e8, e9, e10};
        
        // 4. Create a few employees(above) and add that to Department
        dep1.addEmployees(emp);
        
        // 5. Locate an employee by their identification number
//        System.out.println(dep1.getEmpbyID(123));
        
        System.out.println("Total employee in this department = " + dep1.empCounter()); 
        System.out.println("Employee list = ");
        System.out.println(dep1.getEmployees());
        System.out.println("");
        
        
        try {
            System.out.println("Total Salary = " + dep1.totalSalary());
            System.out.println("Average Salary = " + dep1.AverageSalary());
//            System.out.println(dep1.getEmpbyID(123));
        } catch (NullPointerException e) {
            System.out.println("Array is null! Cannot get Total Salary and Average Salary.");
        }
       
    }
}

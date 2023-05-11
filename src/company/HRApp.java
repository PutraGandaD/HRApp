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
        
//        Employee emp[] = {e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11};
        
        // 4. Create a few employees(above) and add that to Department
        dep1.addEmployees(e1);
        dep1.addEmployees(e2);
        dep1.addEmployees(new Employee(772, "Jack", 299));
        
        Employee[] emps = dep1.getEmployees();
        
        // 5. Locate an employee by their identification number
        System.out.println(dep1.getEmployeeByID(77442));
        
        System.out.println("Total employee in this department = " + dep1.getEmployeeCount()); 
        System.out.println("Employee list = ");
        
        // 6. Get every Employee in that department and print their information
        for (Employee emp : emps) {
            System.out.println("Emp = " + emp);
        }
        
        System.out.println("");
        
        // 7-8. Print total salary and Average Salary of that department
        System.out.println("Total Salary = " + dep1.getTotalSalary());
        System.out.println("Average Salary = " + dep1.getAverageSalary());
        
    }
}

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
        // Employee test
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
        
        // Department test
        Department dep1 = new Department("IT Support Department");
        
        Employee emp[] = {e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12};
        
        dep1.addEmployee(emp);
        
//        for(Employee list : emp) {
//            System.out.println(list);
//        }

        System.out.println(dep1);
        
        System.out.println("Employees in " + dep1.getDep_name() + " =");
        
        Employee[] dep1_emp = dep1.getEmployee();
        for(Employee employee : dep1_emp) {
            System.out.println(employee);
        }
        
        System.out.println("Total Salary = " + dep1.totalSalary());
    }
}

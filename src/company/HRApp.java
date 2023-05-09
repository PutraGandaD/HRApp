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
        
        // Department test
        Department dep1 = new Department("IT Support Department");
        
        Employee lists[] = {e1, e2, e3};
        
        dep1.addEmployee(lists);
        
        for(Employee list : lists) {
            System.out.println(list);
        }

        System.out.println("");
        System.out.println("Department name = " + dep1.getDep_name());
        
        System.out.println("Employees in " + dep1.getDep_name() + " =");
        
        Employee[] dep1_emp = dep1.getEmployee();
        for(Employee employee : dep1_emp) {
            System.out.println(employee);
        }
        
    }
    
}

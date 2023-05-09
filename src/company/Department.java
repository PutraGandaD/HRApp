/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package company;

/**
 *
 * @author putragandadewata
 */
public class Department {
    private String dep_name;
    private Employee[] employee = new Employee[10];

    public Department(String dep_name) {
        this.dep_name = dep_name;
    }

    public String getDep_name() {
        return dep_name;
    }

    public void setDep_name(String dep_name) {
        this.dep_name = dep_name;
    }
    
    public void addEmployee(Employee[] new_emp) {
        employee = new_emp;
    }
    
    public Employee[] getEmployee() {
        return employee;
    }
    
    public double totalSalary() {
        double totalSalary = 0.0;
        
        for (Employee emp : employee) {
            totalSalary += emp.getSalary();
        }
        return totalSalary;
    }
    
    
    @Override
    public String toString() {
        return "Department name = " + getDep_name();
    }
}

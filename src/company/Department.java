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

    public int empCounter() {
        int counter = 0;
        
        for (Employee emp : employee) {
            counter++;
        }
        
        return counter;
    }
    
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
        if(new_emp.length <= 10) {
            employee = new_emp;
        } else {
            System.out.println("Cannot add employee to Department, because employee is exceeded Department capacity!!!");
        }
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
    
    public double AverageSalary() {
        double averageSalary;
     
        averageSalary = totalSalary() / empCounter();
        
        return averageSalary;
    }
    
    
    public Employee getEmpbyID(int empId) {
        Employee empData = null;
        
        for (Employee emp : employee) {
            if (empId == emp.getID()) {
                empData = emp;
            }
        }
        
        return empData;
    }
    
    @Override
    public String toString() {
        return "Department name = " + getDep_name();
    }
    
}

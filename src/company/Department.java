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
            if(emp != null) {
                counter++;
            }
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
    
    public void addEmployees(Employee[] new_emp) {
        if(new_emp.length <= 10) {
            employee = new_emp;
        } else {
            System.out.println("Cannot add employee to Department, because employee is exceeded Department capacity!!!");
        }
    }
    
    public Employee[] getEmployees() {        
        for(Employee emp : employee) {
            if(emp!=null) {
                System.out.println(emp);
            }
        }
        
        return null;
    }
    
    public double totalSalary() {
        double totalSalary = 0.0;
        
        for (Employee emp : employee) {
            if(emp != null) {
                totalSalary += emp.getSalary();
            }           
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
            if (emp != null) {
                if (empId == emp.getID()) {
                    empData = emp;
                    break;
                }
            }
        }
        
        return empData;
    }
    
    @Override
    public String toString() {
        return "Department name = " + getDep_name();
    }
    
}

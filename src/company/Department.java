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
    private Employee[] emp;

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
        emp = new_emp;
    }
    
    public Employee[] getEmployee() {
        return emp;
    }
}

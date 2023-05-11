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
    private Employee[] employees = new Employee[10];
    
    //To indicate array position.
    private int lastAddedEmployeeIndex = -1;

    
    public Department(String dep_name) {
        this.dep_name = dep_name;
    }

    public String getDep_name() {
        return dep_name;
    }

    public void setDep_name(String dep_name) {
        this.dep_name = dep_name;
    }
    
    public void addEmployees(Employee anEmployee) {
        /*
           Increment lastAddedEmployeeIndex and add employee to this position in the employees array.
           When adding new employee to the employees array, consider the length of the array.
           You can simply stop adding extra employees once you have reached your employee array capacity.
        */
        if (lastAddedEmployeeIndex < employees.length) {
            lastAddedEmployeeIndex++;
            employees[lastAddedEmployeeIndex] = anEmployee;
        }
    }
    
    public Employee[] getEmployees() {
        /*
        The idea of this algorithm is to return an array of employees
        that contains the exact number of elements that matches the actual
        number of employees in this department.
        This can be calculated by adding one to the lastAddedEmployeeIndex variable.
        You then need to copy references for relevant employee object from the employees array
        to this new array and return it to the invoker.
        This way invoker always gets an array that is already trimmed to exact required size.
        */
        
        Employee[] actualEmployees = new Employee[lastAddedEmployeeIndex+1];
        
        for(int i = 0; i < actualEmployees.length; i++) {
            actualEmployees[i] = employees[i];
        }
        return actualEmployees;
    }
    
    public int getEmployeeCount() {
        /*
        Variable lastAddedEmployeeIndex indicates last valid position in the employees array.
        Because array indexing starts at zero, you need to add one to get the number of elements
        */
        return lastAddedEmployeeIndex+1;
    }
    
    //Query method that attempts to locale an employee wirh specific id in this department
    public Employee getEmployeeByID(int empId) {
        /*
        You may reserve a local variable, assign employee object to this variable
        and break out of the loop, when required employee has been located.
        
        Employee result = null;
        for(Employee emp: employees) {
            if (emp.getId() == (empId)) {
                result = emp;
                break;
            }
        }
        return result;
        
        Infact, result variable will be null if no employee with matching id would be found.
        
        Howeverm you may simply return required object once its found and return null if no employee
        with a given id has been found.
        */
        for (Employee emp: employees) {
            if(emp.getID() == (empId)) {
                return emp;
            }
        }
        return null;
    }
    
    public double getTotalSalary() {
        /*
        Becase employees array may be partially filled with values, you need to start at position zero
        and stop at the element indicated by the lastAddedEmployeeIndex variable.
        Calculate running total value and return the result.
        */
        double totalSalary = 0.0;
        for (int i = 0; i <= lastAddedEmployeeIndex; i++) {
            totalSalary += employees[i].getSalary();
        }
        return totalSalary;
    }
    
    public double getAverageSalary() {
        /*
        To calculate average salary you need to calculate total and divide it by the number of elements.
        You already have a method that does total calculation.
        You can find out the number of employees in the array by adding one to the lastAddedEmployeeIndex variable.
        If there are no employees in the array than you can return zero as the average does not make much sense in this case.
        */
        if (lastAddedEmployeeIndex > -1) {
            return getTotalSalary() / (lastAddedEmployeeIndex+1);
        }
        return 0.0;
    }
    
    
    
    
    
    
    


    

    
    
    
    @Override
    public String toString() {
        return "Department name = " + getDep_name();
    }
    
}

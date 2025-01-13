package Projects;
import java.util.ArrayList;
import java.util.List;

abstract class Employee {     //  abstrct class  ( abstraction)

    private String name;   // access modifiers 
    private int id;

    public Employee(String name, int id) {        // constructor 
        this.name = name;
        this.id = id;
    }

    public String getName() {     // Encapsulation used here  to access private members  
        return name;              
    }

    public int getId() {            // Encapsulation used here to access private members 
        return id;
    }

    // Abstract method to be implemented by subclasses
    public abstract double calculateSalary();            // Abstract method 

    @Override   // polymorphism,  // method overirding    //   It looks like you've overridden the toString() method for a class named Employee
    public String toString() {    // The toString() method you've provided concatenates the values of the name, id, and the result of the calculateSalary() method into a string and returns it.
        return "Employee [name=" + name + ", id=" + id + ", salary=" + calculateSalary() + "]";
        // return "employee name = " + name  + "  employee id = " + id  + calculateSalary() ;
        
    }
}
// ------------------------------------------------------------------------------------------------
class FullTimeEmployee extends Employee {  //   If a regular class extends an abstract class  then that regular class must have to implement all the abstract method of parent abstract class .
    private double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {    // constructor 
        super(name, id);  // dusre class se le rahe hai name or id islie super use ho raha hai   // Super keyword is a reference variable which is used to refer immediate parent class object
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {    //  // Abstract method   body 
        return monthlySalary;
    }
}
// ------------------------------------------------------------------------------------------------
class PartTimeEmployee extends Employee {   //   If a regular class extends an abstract class  then that regular class must have to implement all the abstract method of parent abstract class .
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
        super(name, id);    // dusre class se le rahe hai name or id islie super use ho raha hai   // Super keyword is a reference variable which is used to refer immediate parent class object
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {    //  // Abstract method   body
        return hoursWorked * hourlyRate;  
    }
}
// ------------------------------------------------------------------------------------------------
class PayrollSystem {  // sarra data leke store karega phir throw karega 
    private List<Employee> employeeList;    //  iske andr list bhi tooh chaiye   
    // It looks like you've declared a private List variable named employeeList of type Employee. 
    // employeeList = variable list ka naam hai 
    // employeeList banaya hai Employee ka  ;
    // Employee ho gaya data type Employee naam ka hii data type ja skta hai 
    // ArrayList<Integer> arr = new ArrayList<>();
    // ArrayList banata hai  Integer ka wasise hii employeeList bana hai employee ka 
    // list is similar to array only only differnece is that list incrase his memory size when he is getting fulled

    public PayrollSystem() {   // constructor 
        employeeList = new ArrayList<>();   // uupar walle ka list yaha bana hai 
    }

    public void addEmployee(Employee employee) {  // Nnormal Method 
        employeeList.add(employee);
        // interger list me interger dalte ho
        // array list me aaray daaloge  n   
    }

    public void removeEmployee(int id) {      // Nnormal Method 
        Employee employeeToRemove = null;
        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                employeeToRemove = employee;
                break;
            }
        }
        if (employeeToRemove != null) {
            employeeList.remove(employeeToRemove);
        }
    }

    public void displayEmployees() {    // Nnormal Method 
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}

// ------------------------------------------------------------------------------------------------

public class Employee_payroll_System {
    public static void main(String[] args) {
        PayrollSystem obj = new PayrollSystem();
        FullTimeEmployee emp1 = new FullTimeEmployee("John Doe", 101, 5000.0);
        PartTimeEmployee emp2 = new PartTimeEmployee("Jane Smith", 102, 30, 15.0);

        obj.addEmployee(emp1);
       obj.addEmployee(emp2);

        System.out.println("Initial Employee Details:");
        obj.displayEmployees();

        System.out.println("\nRemoving Employee...");
      obj.removeEmployee(101);

        System.out.println("\nRemaining Employee Details:");
        obj.displayEmployees();
    }
}



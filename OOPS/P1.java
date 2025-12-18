package OOPS;

import java.io.Console;

class Employee{
    private int empId;;
    public String empName;
    protected float empSalary;
    private int empAge;
    public String department;

    Employee(int id, String name, float salary, int age, String dept){
        this.empId = id;
        this.empName = name;
        this.empSalary = salary;
        this.empAge = age;
        this.department = dept;
    }

    public float calculateBonus(){
        return empSalary * 0.10f;
    }

    public void displayDetails(){
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Salary: " + empSalary);
        System.out.println("Employee Age: " + empAge);
        System.out.println("Department: " + department);
        System.out.println("Salary after bonus: " + calculateBonus());
    }
}

public class P1 {
    public static void main(String[] args) {
        Console c = System.console();
        int n = Integer.parseInt(c.readLine("Enter number of employees: "));
        Employee [] e = new Employee[n];
        for(int i = 0; i < n; i++){
            int id = Integer.parseInt(c.readLine("Enter Employee ID: "));
            String name = c.readLine("Enter Employee Name: ");
            float salary = Float.parseFloat(c.readLine("Enter Employee Salary: "));
            int age = Integer.parseInt(c.readLine("Enter Employee Age: "));
            String dept = c.readLine("Enter Department: ");
            Employee emp = new Employee(id, name, salary, age, dept);
            e[i] = emp;
        }

        for(Employee emp : e){
            System.out.println("\nEmployee Details:");
            emp.displayDetails();
        }   
    }
}

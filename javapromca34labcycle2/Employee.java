import java.util.Scanner;

public class Employee {
    private int empNo;
    private String empName;
    private double salary;
    
    public Employee(int empNo, String empName, double salary) {
        this.empNo = empNo;
        this.empName = empName;
        this.salary = salary;
    }
    
    public int getEmpNo() {
        return empNo;
    }
    
    public String getEmpName() {
        return empName;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Employee Search Program!");
        
        System.out.print("Please enter the number of employees: ");
        int n = scanner.nextInt();
        
        Employee[] employees = new Employee[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("\nPlease enter details for employee " + (i+1) + ":");
            System.out.print("Employee Number: ");
            int empNo = scanner.nextInt();
            System.out.print("Employee Name: ");
            String empName = scanner.next();
            System.out.print("Employee Salary: ");
            double salary = scanner.nextDouble();
            employees[i] = new Employee(empNo, empName, salary);
        }
        
        System.out.println("\nEmployee information has been successfully stored!");
        
        System.out.print("\nPlease enter the employee number you want to search for: ");
        int searchEmpNo = scanner.nextInt();
        
        for (Employee emp : employees) {
            if (emp.getEmpNo() == searchEmpNo) {
                System.out.println("\nEmployee found:");
                System.out.println("Employee Name: " + emp.getEmpName());
                System.out.println("Employee Salary: " + emp.getSalary());
                return;
            }
        }
        
        System.out.println("\nSorry, the employee with the given employee number was not found.");
    }
}


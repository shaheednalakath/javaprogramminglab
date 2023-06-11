import java.util.*;

class Person {
    String name;
    String gender;
    String address;

    Person(String name, String gender, String address) {
        this.name = name;
        this.gender = gender;
        this.address = address;
    }
}

class Employee extends Person {
    String emp_id;
    String company;
    String qualification;
    double salary;

    Employee(String name, String gender, String address, String emp_id, String company, String qualification, double salary) {
        super(name, gender, address);
        this.emp_id = emp_id;
        this.company = company;
        this.qualification = qualification;
        this.salary = salary;
    }
}

class Teacher extends Employee {
    String subject;
    String department;
    String teacher_id;

    Teacher(String name, String gender, String address, String emp_id, String company, String qualification, double salary, String subject, String department, String teacher_id) {
        super(name, gender, address, emp_id, company, qualification, salary);
        this.subject = subject;
        this.department = department;
        this.teacher_id = teacher_id;
    }

    void display() {
        System.out.println("Subject: " + subject + ", Department: " + department + ", Teacher ID: " + teacher_id);
        System.out.println("Name: " + name + ", Gender: " + gender + ", Address: " + address);
        System.out.println("Employee ID: " + emp_id + ", Company: " + company + ", Qualification: " + qualification + ", Salary: " + salary);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of teachers in the college:");
        int n = sc.nextInt();
        Teacher[] teachers = new Teacher[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of teacher " + (i + 1) + ":");
            System.out.println("Enter teacher name:");
            String t_n = sc.next();
            System.out.println("Enter gender:");
            String t_g = sc.next();
            System.out.println("Enter address:");
            String t_a = sc.next();
            System.out.println("Enter employee ID:");
            String t_eid = sc.next();
            System.out.println("Enter company name:");
            String t_c = sc.next();
            System.out.println("Enter qualification:");
            String t_q = sc.next();
            System.out.println("Enter salary:");
            double t_s = sc.nextDouble();
            System.out.println("Enter subject the teacher teaches:");
            String t_sub = sc.next();
            System.out.println("Enter teacher department:");
            String t_dep = sc.next();
            System.out.println("Enter teacher ID:");
            String t_id = sc.next();
            teachers[i] = new Teacher(t_n, t_g, t_a, t_eid, t_c, t_q, t_s, t_sub, t_dep, t_id);
        }

        System.out.println("Displaying details of teachers:");
        for (int i = 0; i < n; i++) {
            teachers[i].display();
        }
    }
}

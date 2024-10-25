import java.util.Scanner;

class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}

class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        String employeeName = scanner.nextLine();
        double employeeSalary = scanner.nextDouble();
        scanner.nextLine(); 
        Employee employee = new Employee(employeeName, employeeSalary);

        
        String managerName = scanner.nextLine();
        double managerSalary = scanner.nextDouble();
        scanner.nextLine(); 
        String managerDepartment = scanner.nextLine();
        Manager manager = new Manager(managerName, managerSalary, managerDepartment);

        String developerName = scanner.nextLine();
        double developerSalary = scanner.nextDouble();
        scanner.nextLine(); 
        String developerLanguage = scanner.nextLine();
        Developer developer = new Developer(developerName, developerSalary, developerLanguage);

        System.out.println();
        employee.displayDetails();
        System.out.println();
        manager.displayDetails();
        System.out.println();
        developer.displayDetails();

        scanner.close();
    }
}

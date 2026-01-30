class Employee {
    int empId;
    String empName;
    double salary;

    Employee(int id, String name, double sal) {
        empId = id;
        empName = name;
        salary = sal;
    }

    void display() {
        System.out.println(empId + " " + empName + " " + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Aamir", 50000);
        Employee e2 = new Employee(102, "Rahul", 60000);

        e1.display();
        e2.display();
    }
}

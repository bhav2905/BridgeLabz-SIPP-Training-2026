package SortingAlgo;

public class Employee {

    private int id;
    private String name;
    private double salary;
    private Department deptName;

    public Employee(int id,
                    String name,
                    double salary,
                    Department deptName) {

        this.id = id;
        this.name = name;
        this.salary = salary;
        this.deptName = deptName;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Department getDeptName() {
        return deptName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department=" + deptName +
                '}';
    }
}
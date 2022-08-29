public class Employee {
    private String name;
    private int department;
    private Double salary;
    private int id;
    static int counter ;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }

    public String getname() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getDepartment() {
        return  department;
    }

    public int getId() {
        return id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }


    public Employee(String name, int department, Double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        id = ++ counter;

    }




}

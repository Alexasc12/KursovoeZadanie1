public class Main {
    static Employee[] employees = new Employee[10];


    public static void main(String[] args) {
        Employee Kate = new Employee("Катя", 1, 37000.00);
        Employee Misha = new Employee("Маша", 1, 39000.00);
        Employee Sasha = new Employee("Саша", 2, 47000.00);
        Employee Dima = new Employee("Дима", 2, 45000.00);
        Employee Fedia = new Employee("Федя", 3, 32000.00);
        Employee Ulia = new Employee("Юля", 3, 33000.00);
        Employee Kola = new Employee("Коля", 4, 51000.00);
        Employee Marat = new Employee("Марат", 4, 53000.00);
        Employee Nikita = new Employee("Никита", 5, 65000.00);
        Employee Gena = new Employee("Гена", 5, 67000.00);


        employees[0] = Kate;
        employees[1] = Misha;
        employees[2] = Sasha;
        employees[3] = Dima;
        employees[4] = Fedia;
        employees[5] = Ulia;
        employees[6] = Kola;
        employees[7] = Marat;
        employees[8] = Nikita;
        employees[9] = Gena;

        printAllEmployees();
        System.out.println(getSumSalary());
        System.out.println(getMinSalary());
        System.out.println(getEmployeeMaxSalary());
        System.out.println(getMidlSumSalary());
        printAllName();
        indexSalary(20);
    }

    public static void printAllEmployees() {


        for (int i = 0; i < employees.length; i++)
            System.out.println(employees[i]);
    }

    public static double getSumSalary() {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null) {
                sum = sum + employees[i].getSalary();
            }
        }
        return sum;
    }

    public static double getMinSalary() {
        double sum = Double. MAX_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < sum)
                sum = employees[i].getSalary();
        }
        return sum;
    }

    public static double getEmployeeMaxSalary() {
        double sum = Double.MIN_VALUE;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null){
            }
            if (employees[i].getSalary() > sum)
                sum = employees[i].getSalary();
        }
        return sum;
    }




    public static double getMidlSumSalary() {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum = sum + employees[i].getSalary();
        }
        return sum/employees.length;
    }
    public static void printAllName() {


        for (int i = 0; i < employees.length; i++)
            System.out.println(employees[i].getname());
    }

    public static void indexSalary(double x) {
        double Salary;

        for (int i = 0; i < employees.length; i++){

            Salary = ((employees[i].getSalary() * x/100) + employees[i].getSalary());
            System.out.println( Salary);
        }
    }

    }











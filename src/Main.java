import java.sql.SQLOutput;

public class Main {
    static Employee[] employees = new Employee[10];
    public static void main(String[] args) {

        employees[0] = new Employee(new Name("Олег", "Олегов", "Олегович"), 1, 656544);
        employees[1] = new Employee(new Name("Константин", "Константинов", "Константинович"), 1, 146785);
        employees[2] = new Employee(new Name("Денис", "Денисов", "Денисович"), 2, 45641);
        employees[3] = new Employee(new Name("Павел", "Павлов", "Павлович"), 2, 12587);
        employees[4] = new Employee(new Name("Петр", "Петров", "Петрович"), 3, 123444);
        employees[5] = new Employee(new Name("Евгений", "Евгеньев", "Евгеньевич"), 3, 75416);
        employees[6] = new Employee(new Name("София", "Софьева", "Софьевна"), 4, 78645);
        employees[7] = new Employee(new Name("Лариса", "Ларисова", "Ларисовна"), 4, 456786);
        employees[8] = new Employee(new Name("Катя", "Катява", "Катьевна"), 5, 111111);
        employees[9] = new Employee(new Name("Мефистофель", "Дьяволов", "Адович"), 5, 666666);
        printAllEmployees();

        System.out.println("Сумма всех зарплат: " + getSummOfSalaryes() + " рублей");

        System.out.println("Минимальная зарплата у сотрудника под номером - " + getMostUnderpaidEmployee());
        System.out.println("Максимальная зарплата у сотрудника под номером - " + getMostWellPayedEmployee());
        System.out.println("Средняя зарплата: " + getAverageSalary(getSummOfSalaryes()));
        printNames();
    }
    public static void printAllEmployees(){
        int i = 0;
        while (i < employees.length) {
            System.out.println(employees[i]);
            i++;
        }
    }
    public static int getSummOfSalaryes() {
        int summ = 0;
        for (Employee employee : employees) {
            summ = summ + employee.getSalary();
        }
        return summ;
    }
    public static int getMostUnderpaidEmployee(){
        int min = employees[0].getSalary();
        int minId = 1;
        for(int i = 1; i < employees.length; i++) {
            if(min > employees[i].getSalary())
            {
               min = employees[i].getSalary();
               minId = employees[i].getId();
            }
            }
        return minId;
    }
    public static int getMostWellPayedEmployee(){
        int max = employees[0].getSalary();
        int maxId = 1;
        for(int i = 1; i < employees.length; i++) {
            if(max < employees[i].getSalary())
            {
                max = employees[i].getSalary();
                maxId = employees[i].getId();
            }
        }
        return maxId;
    }

    public static double getAverageSalary(int summ) {
        return (double)summ/employees.length;
    }
    public static void printNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }
}
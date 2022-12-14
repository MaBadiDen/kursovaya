import java.sql.SQLOutput;

public class Main {
    static Employee[] employees = new Employee[10];
    public static void main(String[] args) {

        employees[0] = new Employee(new Name("????", "??????", "????????"), 1, 656544);
        employees[1] = new Employee(new Name("??????????", "????????????", "??????????????"), 1, 146785);
        employees[2] = new Employee(new Name("?????", "???????", "?????????"), 2, 45641);
        employees[3] = new Employee(new Name("?????", "??????", "????????"), 2, 12587);
        employees[4] = new Employee(new Name("????", "??????", "????????"), 3, 123444);
        employees[5] = new Employee(new Name("???????", "????????", "??????????"), 3, 75416);
        employees[6] = new Employee(new Name("?????", "???????", "????????"), 4, 78645);
        employees[7] = new Employee(new Name("??????", "????????", "?????????"), 4, 456786);
        employees[8] = new Employee(new Name("????", "??????", "????????"), 5, 111111);
        employees[9] = new Employee(new Name("???????????", "????????", "??????"), 5, 666666);
        printAllEmployees();

        System.out.println("????? ???? ???????: " + getSummOfSalaryes() + " ??????");

        System.out.println("??????????? ???????? ? ?????????? ??? ??????? - " + getMostUnderpaidEmployee());
        System.out.println("???????????? ???????? ? ?????????? ??? ??????? - " + getMostWellPayedEmployee());
        System.out.println("??????? ????????: " + getAverageSalary(getSummOfSalaryes()));
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
        int i = 0;
        for (Employee employee : employees) {
            if(employees[i] != null) {
                summ = summ + employee.getSalary();
            }
            i++;
        }
        return summ;
    }
    public static int getMostUnderpaidEmployee(){
        int min = 0;
        int minId = 0;
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null){
                min = employees[i].getSalary();
                minId = i;
                break;
            }
        }
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
        int max = 0;
        int maxId = 0;

        for(int i = 0; i < employees.length; i++) {
            if(employees[i] != null){
                max = employees[i].getSalary();
                maxId = i;
                break;
            }
        }

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
        int counter = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                counter++;
            }
        }
        return (double)summ/counter;
    }
    public static void printNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }
}
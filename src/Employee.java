public class Employee {
    private Name name;
    private int departament;
    private int salary;
    private static int count;
    private final int id;

    public Employee(Name name, int departament, int salary) {
        this.name = name;
        this.departament = departament;
        this.salary = salary;
        id = ++count;
    }

    public int getId() {
        return id;
    }

    public Name getName() {
        return name;
    }

    public int getDepartament() {
        return departament;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public void setDepartament(int departament) {
        this.departament = departament;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Сотрудник под номером " + id + " с именем " + name + " из отдела №" + departament + " зарабатывает - " + salary + " рублей";
    }
}

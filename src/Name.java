public class Name {
    private final String name;
    private final String surname;
    private final String thirdname;

    public Name(String name, String surname, String thirdname) {
        this.name = name;
        this.surname = surname;
        this.thirdname = thirdname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getThirdname() {
        return thirdname;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + thirdname;
    }
}

import java.util.List;

public class Employee {
    private String name;
    private String surname;
    private int age;

    {
        age = -1;
        name = "Ivan";
        surname = "Ivanov";
    }

    private Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    private Employee(String name, String surname, List<String> list) {
        this.name = name;
        this.surname = surname;
    }

    public Employee(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}

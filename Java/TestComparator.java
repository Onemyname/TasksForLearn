import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class TestComparator {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(36, "Vasiliy", "Keprenko", 84000);
        Employee emp2 = new Employee(33, "Kirill", "Ursov", 74000);
        Employee emp3 = new Employee(44, "Vadim", "Konovalov", 57000);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println("Before sorting: \n");
        System.out.println(list);
        System.out.println("After sorting: \n");
        Collections.sort(list);
        System.out.println(list);
        System.out.println("After Id sorting: \n");
        Collections.sort(list, new IdComparator());
        System.out.println(list);
        System.out.println("After Name sorting: \n");
        Collections.sort(list, new NameComparator());
        System.out.println(list);
    }

    static class Employee implements Comparable<Employee> {



        int id;
        String name;
        String surname;
        int salary;

        public Employee(int id, String name, String surname, int salary) {
            this.id = id;
            this.name = name;
            this.surname = surname;
            this.salary = salary;
        }


        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", salary=" + salary +
                    '}';
        }


        @Override
        public int compareTo(Employee employee) {
            return this.salary-employee.salary;
        }

    }
    static class IdComparator implements Comparator<Employee>{

        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.id-o2.id;
        }
    }
    static class NameComparator implements Comparator<Employee>{

        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.name.compareTo(o2.name);
        }
    }
}

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEntrySet {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        printStudentsInfo();
    }

    public static void addStudents() {
        grades.put("Кесарчук Олег", 4.3d);
        grades.put("Шульга Николай", 4.1d);
        grades.put("Колос Василий", 4.9d);
        grades.put("Шевченко Тарас", 3.7d);
        grades.put("Марчук Любослав", 3.2d);
    }

    public static void printStudentsInfo() {
        Set<Map.Entry<String, Double>> entries = grades.entrySet();
        for (Map.Entry<String, Double> tipe : entries) {
            String name = tipe.getKey();
            Double number = tipe.getValue();
            System.out.println(name + " : " + number);
        }
    }
}

import java.lang.reflect.*;

public class CreateEmployeeObjectWithReflection {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class employeeClass = Employee.class;

        Constructor<?> employeeConstructor = employeeClass.getDeclaredConstructor(String.class, String.class, int.class);
        System.out.println(employeeConstructor);
        employeeConstructor.setAccessible(true);

        Employee object = (Employee) employeeConstructor.newInstance("Ivan", "Ivanov", 26);
        System.out.println(object);
        
        int age = object.getAge();
        System.out.println(age);
    }
}









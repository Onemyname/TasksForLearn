import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestReflection {
    public static void main(String[] args) {
        Class employeeClass = Employee.class;
        var constructors = getAllConstructors(employeeClass);
        var constructorNames = getConstructorNames(constructors);
        var constructorModifiers = getConstructorModifiers(constructors);

        System.out.println("Класс Employee:");
        System.out.println("Конструкторы :");
        System.out.println(constructorNames);
        System.out.println("Модификаторы :");
        System.out.println(constructorModifiers);

        var constructorParameterTypes = getConstructorParameterTypes(constructors.get(0));
        var constructorParameters = getConstructorParameters(constructors.get(0));
        var constructorParametersGenerics = getConstructorParametersGenerics(constructors.get(0));

        System.out.println("Параметры конструкторов :");
        System.out.println(constructorParameters);

        System.out.println("Типы параметров :");
        System.out.println(constructorParameterTypes);

        System.out.println("Типы параметров конструкторов :");
        System.out.println(constructorParametersGenerics);
    }

    static void printDeclaredConstructors(Class<?> c){
        for (Constructor<?> constructor : c.getDeclaredConstructors()   ) {
            System.out.println(constructor);
        }
    }

    static void printAllConstructors(Class<?> c){
        for (Constructor<?> constructor : c.getConstructors()) {
            System.out.println(constructor);
        }
    }

    static List<Constructor<?>> getAllConstructors(Class<?> c) {
        return new ArrayList<>(Arrays.asList(c.getDeclaredConstructors()));
    }

    static List<String> getConstructorNames(List<Constructor<?>> constructors) {
        List<String> result = new ArrayList<>();
        for (Constructor<?> constructor : constructors) {
            result.add(constructor.toString());
        }
        return result;
    }

    static List<String> getConstructorModifiers(List<Constructor<?>> constructors) {
        List<String> result = new ArrayList<>();
        for (Constructor<?> constructor : constructors) {
            result.add(Modifier.toString(constructor.getModifiers()));
        }
        return result;
    }

    static List<Parameter> getConstructorParameters(Constructor<?> c) {
        return new ArrayList<>(Arrays.asList(c.getParameters()));
    }

    static List<Class<?>> getConstructorParameterTypes(Constructor<?> c) {
        return new ArrayList<>(Arrays.asList(c.getParameterTypes()));
    }

    static List<Type> getConstructorParametersGenerics(Constructor<?> c) {
        return new ArrayList<>(Arrays.asList(c.getGenericParameterTypes()));
    }
}
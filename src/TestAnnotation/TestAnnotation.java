import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class TestAnnotation {
    public static void main(String[] args) {

        List<Class<?>> classList = new ArrayList<>() {{
            add(MyClass1.class);
            add(MyClass2.class);
            add(MyClass3.class);
        }};

        for (Class<?> myClass : classList) {
            try {
                readMyClass(myClass);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }
    }

    static void readMyClass(Class<?> myClassObj) throws NoSuchMethodException {
        System.out.println("\nКласс " + myClassObj.getName());
        readAnnotation(myClassObj);
        Method method = myClassObj.getMethod("myClassMethod");
        readAnnotation(method);
    }

    private static void readAnnotation(AnnotatedElement element)  {
        try {
            System.out.println("Поиск аннотаций в " + element.getClass().getName());
            Annotation[] annotations = element.getAnnotations();

            for (Annotation annotation : annotations) {
                if (annotation instanceof Info) {
                    final Info fileInfo = (Info) annotation;
                    System.out.println("Автор: " + fileInfo.author());
                    System.out.println("Версия: " + fileInfo.version());
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }


}
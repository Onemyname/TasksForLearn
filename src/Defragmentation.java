import java.util.Arrays;

/* 
Дефрагментация памяти
Метод executeDefragmentation(String[]), принимающий массив строк, выполняет его "дефрагментацию",
то есть перемещает все объекты в начало массива в таком же порядке, передвинув все "дыры" (элементы равные null) в конец массива.
*/

public class Defragmentation {

    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
        int count = 0;
        String[] copyArray = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                copyArray[count] = array[i];
                count++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = copyArray[i];
        }
    }
}

/*
Метод printSqrt(int[] array) должен выводить корень квадратный для каждого элемента переданного массива.
В результате работы программа должна выводить в консоли соответствующую строку для каждого элемента массива.

Пример строки:
Корень квадратный для числа 64 равен 8.0

*/

public class SqrtNumber {
    public static void main(String[] args) {
        int[] array = {15,64,9,51,42};
        printSqrt(array);
    }

    public static void printSqrt(int[] array) {
        String elementLine = "Корень квадратный для числа ";
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            double elementSqrt = Math.sqrt(element);
            System.out.println(elementLine + element + " равен " + elementSqrt);
        }
    }
}
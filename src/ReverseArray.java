import java.util.Scanner;

/*
В классе ReverseArray дан двумерный массив целых чисел (поле array) размерностью 3х3. Необходимо:

построчно заполнить этот массив числами с клавиатуры;
перевернуть массив относительно главной диагонали (у главной диагонали есть свойство i == j);
вывести перевернутый массив на экран в таком виде, как в примере — каждую строку отдельно, элементы в строке через пробел.

Пример переворота массива.
Исходный массив:
1 2 3
4 5 6
7 8 9

Массив, перевернутый относительно главной диагонали:

1 4 7
2 5 8
3 6 9

Requirements:

1. В программе нужно считывать 9 чисел с клавиатуры.
2. Массив array необходимо перевернуть относительно главной диагонали.
3. В программе нужно вывести элементы массива согласно условию.

*/

public class ReverseArray {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);


        for (int i = 0; i < array.length; i++) { // заполнение массива
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = console.nextInt();
            }
        }

        for (int i = 0; i < array.length; i++) { //меняем строки на столбцы
            for (int j = i+1; j < array[i].length; j++) {
                if (i==j){
                    continue;
                }
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }

        for (int i = 0; i < array.length; i++) { // вывод на экран
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println() ;
        }
    }
}

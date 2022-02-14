import java.io.IOException;
import java.util.Scanner;

/*
Пирамида
Напишем программу для рисования пирамиды с заданной высотой.
В классе Solution дан двумерный массив символов (поле array). Необходимо:

считать число с клавиатуры — это и будет высота пирамиды;
инициализировать массив array соответствующим значением;
заполнить массив так, чтобы получилась пирамида (клетки, составляющие пирамиду, заполнить символами '#', фон - ' ', см. пример);
вывести массив на экран в таком виде, как в примере (каждую строку отдельно).
Пример вывода для числа 5:

    #
   ###
  #####
 #######
#########

Requirements:
1. В программе нужно считывать число с клавиатуры.
2. Поле array необходимо проинициализировать массивом подходящего размера.
3. Массив array необходимо заполнить согласно условию.
4. В программе нужно вывести элементы массива на экран (см. пример в условии).
*/

public class ArrayPyramid {
    public static char[][] array;

    public static void main(String[] args) throws IOException {
        Scanner console = new Scanner(System.in);
        int line = console.nextInt();
        int row = (line * 2) - 1;
        array = new char[line][row];

        for (int i = 0; i < array.length; i++) { // заполнение массива
            for (int j = 0; j < array[i].length; j++) {
                if (j>= array.length - i - 1 && j < array.length +i ){
                    array[i][j] = '#';
                }
                else{
                    array[i][j] = ' ';
                }
            }
        } for (int i = 0; i < array.length; i++) { // вывод массива на экран
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}

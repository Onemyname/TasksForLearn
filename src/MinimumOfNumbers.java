import java.util.Scanner;

/*
Удаляем одинаковые строки
*/

public class MinimumOfNumbers {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nullLIne = null;
        strings = new String[6];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }
        for (int i = 0; i < strings.length; i++) {
            String currentLine = strings[i];
            for (int j = i + 1; j < strings.length; j++) {
                if (currentLine == nullLIne) {
                    break;
                }
                if (currentLine.equals(strings[j])) {
                    strings[j] = nullLIne;
                    strings[i] = nullLIne;
                }
            }
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
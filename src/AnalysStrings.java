
/*
Анализ строк
*/

import java.lang.reflect.Parameter;

public class AnalysStrings {
    public static void main(String[] args) {
        String string = "Думаю, это будет новой фичей." +
                "Только не говорите никому, что она возникла случайно.";

        System.out.println("Количество цифр в строке : " + countDigits(string));
        System.out.println("Количество букв в строке : " + countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        int count = 0;
        char[] stringArray = string.toCharArray();
        for (int i = 0; i < stringArray.length; i++) {
            if (Character.isDigit(stringArray[i])) {
                count++;
            }
        }
        return count;
    }

    public static int countLetters(String string) {
        int count = 0;
        char[] stringArray = string.toCharArray();
        for (int i = 0; i < stringArray.length; i++) {
            if (Character.isLetter(stringArray[i])) {
                count++;
            }
        }
        return count;
    }

    public static int countSpaces(String string) {
        int count = 0;
        char[] stringArray = string.toCharArray();
        for (int i = 0; i < stringArray.length; i++) {
            if (Character.isSpaceChar(stringArray[i])) {
                count++;
            }
        }
        return count;
    }
}
}

import java.util.Scanner;

/*
Добро пожаловать! Но не всем.
Перед тобой метод signIn(), который приветствует пользователей сайта. Сейчас он приветствует всех пользователей, а должен только зарегистрированных. Имена всех незарегистрированных пользователей — "user".
Добавь проверку имени пользователя в начало метода signIn().
Если имя "user", прерви выполнение метода, используя ключевое слово return.


Requirements:
1. Если имя пользователя "user", метод signIn() должен прекратить работу, не выводя ничего в консоли.
2. Если имя пользователя не "user", метод signIn() должен продолжать работу и вывести строки приветствия в консоли.
3. Для прерывания работы метода signIn() должно использоваться ключевое слово return.
*/

public class EntryForRegisteredUsers {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String username = console.nextLine();
        signIn(username);
    }

    public static void signIn(String username) {
        if (username.equals("user")) {
            return;
        }
        System.out.println("Добро пожаловать " + username);
        System.out.println("Очень скучали по Вам, " + username);
    }
}

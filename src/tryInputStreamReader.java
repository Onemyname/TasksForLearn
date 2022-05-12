import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class tryInputStreamReader {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = null;
        try {
            reader = new InputStreamReader(new FileInputStream("E:\\Java\\file.txt"));

            while (reader.ready()) {
                System.out.print((char) reader.read());
            }
        } catch (
                Exception e) {
            System.out.println("Ошибка");
        } finally {
            reader.close();
        }
    }
}

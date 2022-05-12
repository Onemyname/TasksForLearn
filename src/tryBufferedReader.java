import java.io.*;

public class tryBufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("E:\\Java\\file.txt"));

            while (reader.ready()) {
                System.out.print( reader.readLine());
            }
        } catch (
                Exception e) {
            System.out.println("Ошибка");
        } finally {
            reader.close();
        }
    }
}

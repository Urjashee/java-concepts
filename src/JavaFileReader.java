import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JavaFileReader {

    public static void main(String[] args) {
//        -1 means until the eof
        try {
            FileReader reader = new FileReader("E:/java_projects/art.txt");
            int data = reader.read();
            while (data != -1) {
                System.out.print((char)data);
                data = reader.read();
            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
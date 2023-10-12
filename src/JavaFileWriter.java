import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JavaFileWriter {

    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("E:\\java_projects\\poem.txt");
            writer.write("Roses are red\n");
            writer.append("Violets are blue\n Booty booty booty\n Rocking every where");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
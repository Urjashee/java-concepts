import java.io.File;

public class JavaFile {

    public static void main(String[] args) {
        File file = new File("secret_message.txt");

        if (file.exists()) {
            System.out.println("That file exist :o !");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
        } else {
            System.out.println("That file doesn't exist :( !");
        }
    }
}
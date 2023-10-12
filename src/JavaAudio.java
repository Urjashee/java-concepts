import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class JavaAudio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File file = new File("E:/java_projects/audio1.wav");
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            String response = "";
            while(!response.equals("Q")) {
                System.out.println("P = Play, S = Stop, R = Reset, Q = Quit");
                System.out.println("Enter your choice");
                response = scanner.next();
                response = response.toUpperCase();

                switch (response) {
                    case("P") : clip.start();
                    break;
                    case("S") : clip.stop();
                        break;
                    case("R") : clip.setMicrosecondPosition(0);
                        break;
                    case("Q") : clip.close();
                        break;
                    default:
                        System.out.println("Not a valid response");
                }
            }

        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            throw new RuntimeException(e);
        }
    }
}
import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {
        Random random = new Random();

        int x = random.nextInt(6)+1; // Random number between 1 and 6
        double y = random.nextDouble(); // Random number between 1 and 6
        boolean z = random.nextBoolean();

        System.out.println(z);

    }
}
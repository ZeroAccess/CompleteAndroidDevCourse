import java.util.Random;

/**
 * Created by robertsg on 3/8/2016.
 */
public class HigherOrLower {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(11) + 10;

        System.out.println(randomNumber);
    }
}

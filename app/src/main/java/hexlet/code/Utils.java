package hexlet.code;

import java.util.Random;

public class Utils {

    public static int getRandomNumber (int lower_bound, int upper_bound) {
        Random random = new Random();
        return random.nextInt(lower_bound,upper_bound);
    }
    public static int getRandomNumber (int upper_bound) {
        return getRandomNumber(0,upper_bound);
    }
}

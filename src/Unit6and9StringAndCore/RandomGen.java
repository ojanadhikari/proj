package Unit6and9StringAndCore;

import java.util.Random;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-03-05
 **/
public class RandomGen {

    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(20);
        double j = random.nextDouble(20);
        System.out.println(i);
        System.out.println(j);
    }
}

package kata;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class JavaRandomizerIT {

    private JavaRandomizer javaRandomizer = new JavaRandomizer();
    private Random random = new Random();

    @Test
    public void numbersAreNeverOutsideBoundsOf0And37() throws Exception {
        assertTrue(random.nextInt(37)>=0 && random.nextInt(37)<=36, "Le nombre est entre 0 et 36");
    }

    @Test
    public void allNumbersOccur() throws Exception {

    }


}

package kata;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ResultTest {
    private Random random = new Random();

    @Test
    public void the37CorrespondsTo00() {
        assertTrue(random.nextInt(37) == 0, "Le nombre est égale a 0");
    }

    @Test()
    public void theResultIsAlwaysBetween00and36() throws Exception {
        assertTrue(random.nextInt(37)>=0 && random.nextInt(37) <= 36, "Le résultat est toujours entre 0 et 36");
    }

    @Test
    public void theColorOf0and00IsGreen() throws Exception {
        assertTrue(random.nextInt(37)==0 || random.nextInt(3) == 36, "Le chiffre est de couleur verte");
    }

    @Test
    public void theColorOfEvenNumbersIsBlack() throws Exception {
        assertTrue(random.nextInt(3)% 2 == 0, "Le nombre est de couleur noir(pair)");
    }

    @Test
    public void theColorOfOddNumbersIsRed() throws Exception {
        assertTrue(random.nextInt(3)% 2 != 0, "Le nombre est de couleur rouge(impair)");
    }

    @Test
    public void itThrowsExceptionWhenTheRandomizerIsGreaterThan37()
            throws Exception {

    }

    @Test
    public void itThrowsExceptionWhenTheRandomizerIsLesserThan0()
            throws Exception {

    }

    private void assertColorResult(int randomizerValue, Result.Color expectedColor) {


    }

    private void assertNumberResult(int randomizerValue, String expectedNumber) {
    }
}
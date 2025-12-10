
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiceTest {

    @Test
    public void shouldReturnNumberFromOneToSix() {
        //assemble
        Dice dice = new Dice();

        //act
        int result = Dice.dice(6);

        //assert
        Assertions.assertTrue(result >= 1 && result <= 6);
    }
    @Test
    public void shouldReturnRandomNumberFromOneToTwentyDice() {
        //assemble
        Dice dice = new Dice();

        //act
        int result = Dice.dice(20);

        //assert
        Assertions.assertTrue(result >= 1 && result <= 20);
    }
    @Test
    public void shouldReturnRandomNumberFromOneToNineNineNineNineNineDice() {
        //assemble
        Dice dice = new Dice();

        //act
        int result = Dice.dice(99999);

        //assert
        Assertions.assertTrue(result >= 1 && result <= 99999);
    }
    @Test
    public void shouldReturnRandomNumberFromOneToOneDice() {
        //assemble
        Dice dice = new Dice();

        //act
        int result = Dice.dice(1);

        //assert
        Assertions.assertTrue(result >= 1 && result <= 1);
    }
    @Test
    public void shouldReturnRandomNumberFromOneToNegativeOneDice() {
        //assemble
        Dice dice = new Dice();

        //act
        int result = Dice.dice(-10);

        //assert
        Assertions.assertTrue(result >= -10 && result <= 1);
    }



}
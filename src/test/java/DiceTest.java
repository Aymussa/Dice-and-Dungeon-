
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
    public void shouldReturnRandomNumberDiceCaseOne() {
        //assemble
        Dice dice = new Dice();

        //act
        int result = Dice.dice(20);

        //assert
        Assertions.assertTrue(result >= 1 && result <= 20);
    }
    @Test
    public void shouldReturnRandomNumberDiceCaseTwo() {
        //assemble
        Dice dice = new Dice();

        //act
        int result = Dice.dice(99999);

        //assert
        Assertions.assertTrue(result >= 1 && result <= 99999);
    }


}
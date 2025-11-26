
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiceTest {

    @Test
    public void shouldReturnRandomNumberDice() {
        //assemble
        Dice dice = new Dice();

        //act
        int result = Dice.dice(6);

        //assert
        Assertions.assertTrue(result >= 1 && result <= 6);
        assertEquals(Dice.dice(1), (Math.random() * Dice.dice(1)) + 1);
    }
}
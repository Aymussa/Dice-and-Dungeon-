import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    public void ShouldReturnStringAsAnInputName() {
        //assemble
        //Game game = new Game();

        //act
//        String inputTestPlayerName = "TestPlayerName\n";
//        String inputTestName = new String(inputTestPlayerName.getBytes());
//        System.setIn(inputTestName);
//
//        Scanner scanner = new Scanner(System.in);
//        String playerName = scanner.nextLine();
//
//        //assert
//        Assertions.assertEquals("TestPlayerName", playerName);
//        scanner.close();
    }

    @Test
    public void ShouldReturnStringAsAnInputACharacterNumber() {
        //assemble

        Game game = new Game();

        //act
        String result = Game.getCharacterClass(1);


        //assert
        assertEquals(result, "Wizard");

    }

    @Test
    public void ShouldReturnStringAsAnInputABossNumber() {
        //assemble
        Game game = new Game();

        //act
        String result = Game.getBoss(1) ;


        //assert
        assertEquals(result,"Dragon");

    }
}


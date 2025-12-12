import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    public void ShouldReturnStringAsAnInputACharacterNumberOne() {
        //arrange

        Game game = new Game();

        //act
        String result = Game.getCharacterClass(1);


        //assert
        assertEquals(result, "Wizard");

    }
    @Test
    public void ShouldReturnStringAsAnInputACharacterNumberTwo() {
        //arrange

        Game game = new Game();

        //act
        String result = Game.getCharacterClass(2);


        //assert
        assertEquals(result, "Knight");

    }
    @Test
    public void ShouldReturnStringAsAnInputACharacterNumberThree() {
        //arrange
        Game game = new Game();

        //act
        String result = Game.getCharacterClass(3);


        //assert
        assertEquals(result, "Wood Elf");

    }
    @Test
    public void ShouldReturnStringAsAnInputACharacterNumberFour() {
        //arrange

        Game game = new Game();

        //act
        String result = Game.getCharacterClass(4);


        //assert
        assertEquals(result, "High Elf");

    }

    @Test
    public void ShouldReturnStringAsAnInputABossNumberOne() {
        //arrange
        Game game = new Game();

        //act
        String result = Game.getBoss(1) ;


        //assert
        assertEquals(result,"Dragon");

    }
    @Test
    public void ShouldReturnStringAsAnInputABossNumberTwo() {
        //arrange
        Game game = new Game();

        //act
        String result = Game.getBoss(2) ;


        //assert
        assertEquals(result,"Dark Elf");

    }
    @Test
    public void ShouldReturnStringAsAnInputABossNumberThree() {
        //arrange
        Game game = new Game();

        //act
        String result = Game.getBoss(3) ;


        //assert
        assertEquals(result,"Cerberus");

    }
    @Test
    public void ShouldReturnStringAsAnInputABossNumberFour() {
        //arrange
        Game game = new Game();

        //act
        String result = Game.getBoss(4) ;


        //assert
        assertEquals(result,"Goblin");

    }
    @Test
    public void ShouldReturnNullForInvalidInputCaseOne() {
        //arrange
        Game game = new Game();

        //act
        String result = Game.getCharacterClass(0) ;


        //assert
        assertNull(result,"invalid");

    }
    @Test
    public void ShouldReturnNullForInvalidInputCaseTwo() {
        //arrange
        Game game = new Game();

        //act
        String result = Game.getBoss(0) ;


        //assert
        assertNull(result,"invalid");

    }
    @Test
    public void ShouldReturnNullForInvalidInputCaseThree() {
        //arrange
        Game game = new Game();

        //act
        String result = Game.getCharacterClass(5) ;


        //assert
        assertNull(result,"invalid");

    }
    @Test
    public void ShouldReturnNullForInvalidInputCaseFour() {
        //arrange
        Game game = new Game();

        //act
        String result = Game.getBoss(5) ;


        //assert
        assertNull(result,"invalid");

    }
    @Test
    public void ShouldReturnWizardWhenCreatPlayerUserCharacterChoiceIsWizard() {
        //arrange
        Game game = new Game();

        //act
        Character result = Game.createPlayer("Wizard") ;


        //assert
        assertNotNull(result);
        assertTrue(result instanceof PlayerCharacter.Wizard);
    }
    @Test
    public void ShouldReturnWoodElfWhenCreatPlayerUserCharacterChoiceIsWoodElf() {
        //arrange
        Game game = new Game();

        //act
        Character result = Game.createPlayer("Wood Elf") ;


        //assert
        assertNotNull(result);
        assertTrue(result instanceof PlayerCharacter.WoodElf);
    }
    @Test
    public void ShouldReturnKnightWhenCreatPlayerUserCharacterChoiceIsKnight() {
        //arrange
        Game game = new Game();

        //act
        Character result = Game.createPlayer("Knight") ;


        //assert
        assertNotNull(result);
        assertTrue(result instanceof PlayerCharacter.Knight);
    }
    @Test
    public void ShouldReturnHighElfWhenCreatPlayerUserCharacterChoiceIsHighElf() {
        //arrange
        Game game = new Game();

        //act
        Character result = Game.createPlayer("High Elf") ;


        //assert
        assertNotNull(result);
        assertTrue(result instanceof PlayerCharacter.HighElf);
    }
    @Test
    public void ShouldReturnNullWhenCreatePlayerUserCharacterChoiceIsInvalid() {
        //arrange
        Game game = new Game();

        //act
        Character result = Game.createPlayer("invalid") ;


        //assert
        assertNull(result,"invalid");
    }

    @Test
    public void ShouldReturnNullWhenCreateBossUserChoiceIsInvalid() {
        //arrange
        Game game = new Game();

        //act
        Character result = Game.createBoss("invalid") ;


        //assert
        assertNull(result,"invalid");
    }

}


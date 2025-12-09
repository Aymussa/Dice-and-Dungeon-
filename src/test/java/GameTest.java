import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    public void ShouldReturnStringAsAnInputACharacterNumberOne() {
        //assemble

        Game game = new Game();

        //act
        String result = Game.getCharacterClass(1);


        //assert
        assertEquals(result, "Wizard");

    }
    @Test
    public void ShouldReturnStringAsAnInputACharacterNumberTwo() {
        //assemble

        Game game = new Game();

        //act
        String result = Game.getCharacterClass(2);


        //assert
        assertEquals(result, "Knight");

    }
    @Test
    public void ShouldReturnStringAsAnInputACharacterNumberThree() {
        //assemble

        Game game = new Game();

        //act
        String result = Game.getCharacterClass(3);


        //assert
        assertEquals(result, "Wood Elf");

    }
    @Test
    public void ShouldReturnStringAsAnInputACharacterNumberFour() {
        //assemble

        Game game = new Game();

        //act
        String result = Game.getCharacterClass(4);


        //assert
        assertEquals(result, "High Elf");

    }

    @Test
    public void ShouldReturnStringAsAnInputABossNumberOne() {
        //assemble
        Game game = new Game();

        //act
        String result = Game.getBoss(1) ;


        //assert
        assertEquals(result,"Dragon");

    }
    @Test
    public void ShouldReturnStringAsAnInputABossNumberTwo() {
        //assemble
        Game game = new Game();

        //act
        String result = Game.getBoss(2) ;


        //assert
        assertEquals(result,"Dark Elf");

    }
    @Test
    public void ShouldReturnStringAsAnInputABossNumberThree() {
        //assemble
        Game game = new Game();

        //act
        String result = Game.getBoss(3) ;


        //assert
        assertEquals(result,"Cerberus");

    }
    @Test
    public void ShouldReturnStringAsAnInputABossNumberFour() {
        //assemble
        Game game = new Game();

        //act
        String result = Game.getBoss(4) ;


        //assert
        assertEquals(result,"Goblin");

    }
    @Test
    public void ShouldReturnNullForInvalidInputCaseOne() {
        //assemble
        Game game = new Game();

        //act
        String result = Game.getCharacterClass(0) ;


        //assert
        assertNull(result,"invalid");

    }
    @Test
    public void ShouldReturnNullForInvalidInputCaseTwo() {
        //assemble
        Game game = new Game();

        //act
        String result = Game.getBoss(0) ;


        //assert
        assertNull(result,"invalid");

    }
    @Test
    public void ShouldReturnNullForInvalidInputCaseThree() {
        //assemble
        Game game = new Game();

        //act
        String result = Game.getCharacterClass(5) ;


        //assert
        assertNull(result,"invalid");

    }
    @Test
    public void ShouldReturnNullForInvalidInputCaseFour() {
        //assemble
        Game game = new Game();

        //act
        String result = Game.getBoss(5) ;


        //assert
        assertNull(result,"invalid");

    }
    @Test
    public void ShouldReturnWizardWhenCreatPlayerUserCharacterChoiceIsWizard() {
        //assemble
        Game game = new Game();

        //act
        Character result = Game.createPlayer("Wizard") ;


        //assert
        assertNotNull(result);
        assertTrue(result instanceof HumanCharacter.Wizard);
    }
    @Test
    public void ShouldReturnWoodElfWhenCreatPlayerUserCharacterChoiceIsWoodElf() {
        //assemble
        Game game = new Game();

        //act
        Character result = Game.createPlayer("Wood Elf") ;


        //assert
        assertNotNull(result);
        assertTrue(result instanceof ElfCharacter.WoodElf);
    }
    @Test
    public void ShouldReturnKnightWhenCreatPlayerUserCharacterChoiceIsKnight() {
        //assemble
        Game game = new Game();

        //act
        Character result = Game.createPlayer("Knight") ;


        //assert
        assertNotNull(result);
        assertTrue(result instanceof HumanCharacter.Knight);
    }
    @Test
    public void ShouldReturnHighElfWhenCreatPlayerUserCharacterChoiceIsHighElf() {
        //assemble
        Game game = new Game();

        //act
        Character result = Game.createPlayer("High Elf") ;


        //assert
        assertNotNull(result);
        assertTrue(result instanceof ElfCharacter.HighElf);
    }
    @Test
    public void ShouldReturnNullWhenCreatePlayerUserCharacterChoiceIsInvalid() {
        //assemble
        Game game = new Game();

        //act
        Character result = Game.createPlayer("invalid") ;


        //assert
        assertNull(result,"invalid");
    }

    @Test
    public void ShouldReturnNullWhenCreateBossUserChoiceIsInvalid() {
        //assemble
        Game game = new Game();

        //act
        Character result = Game.createBoss("invalid") ;


        //assert
        assertNull(result,"invalid");
    }

}


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
Test the PlayerCharacter class to ensure that it is created correctly
and that the lostLife method works as expected.
and that the lives can reach zero.
this is for all player characters subclasses
 */
class PlayerCharacterTest {
    @Test
    public void testPlayerCharacter() {
        //arrange
        PlayerCharacter player = new PlayerCharacter.Wizard("Test");

        //act

        //assert
        assertEquals(3, player.getLives2());
    }

    @Test
    void lostLifeDecrementsLives() {
        //arrange
        PlayerCharacter player = new PlayerCharacter.Wizard("Test");

        //act
        player.lostLife();

        //assert
        assertEquals(2, player.getLives2());

        //act
        player.lostLife();

        //assert
        assertEquals(1, player.getLives2());
    }

    @Test
    void livesCanReachZero() {
        //arrange
        PlayerCharacter player = new PlayerCharacter.Wizard("Test");

        //act
        player.lostLife();
        player.lostLife();
        player.lostLife();


        //assert
        assertEquals(0, player.getLives2());
    }

}
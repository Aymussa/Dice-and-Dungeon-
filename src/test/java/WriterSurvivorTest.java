import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class WriterSurvivorTest {
    @Test
    public void ShouldWriteSurvivorTextFileAfterPlayerWins() {
        //arrange
        File file = new File("Survivor.txt");
        if (file.exists()) {
            file.delete();
        }

        //act
        PlayerCharacter player = new PlayerCharacter("TestPlayer");
        BossCharacter boss = new BossCharacter("TestBoss");
        WriterSurvivor.main(player,boss);

        //assert
        assertTrue(file.exists());
    }

}
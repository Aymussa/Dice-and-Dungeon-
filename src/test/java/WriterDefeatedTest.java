import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class WriterDefeatedTest {
    @Test
    public void ShouldWriteDefeatedTextFileAfterPlayerLoses() {
        //arrange
        File file = new File("Defeated.txt");
        if (file.exists()) {
            file.delete();
        }

        //act
        PlayerCharacter player = new PlayerCharacter("TestPlayer");
        BossCharacter boss = new BossCharacter("TestBoss");
        WriterDefeated.main(player,boss);


        //assert
        assertTrue(file.exists());
    }

}
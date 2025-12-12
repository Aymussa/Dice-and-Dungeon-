import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class WriterWinnerTest {
    @Test
    public void ShouldWriteWinnerTextFileAfterPlayerWins() {
        //arrange
        File file = new File("Winner.txt");
        if (file.exists()) {
            file.delete();
        }

        //act
        PlayerCharacter player = new PlayerCharacter("TestPlayer");
        BossCharacter boss = new BossCharacter("TestBoss");
        WriterWinner.main(player,boss);

        //assert
        assertTrue(file.exists());
    }

}
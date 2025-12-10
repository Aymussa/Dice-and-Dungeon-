import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class WriterWinnerTest {
    @Test
    public void ShouldWriteWinnerTextFileAfterPlayerWins() {
        //assemble
        File file = new File("Winner.txt");
        if (file.exists()) {
            file.delete();
        }

        //act
        WriterWinner.main();

        //assert
        assertTrue(file.exists());
    }

}
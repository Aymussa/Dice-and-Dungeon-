import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class WriterDefeatedTest {
    @Test
    public void ShouldWriteDefeatedTextFileAfterPlayerLoses() {
        //assemble
        File file = new File("Defeated.txt");
        if (file.exists()) {
            file.delete();
        }

        //act
        WriterDefeated.main();


        //assert
        assertTrue(file.exists());
    }

}
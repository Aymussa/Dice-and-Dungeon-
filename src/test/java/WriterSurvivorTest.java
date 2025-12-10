import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class WriterSurvivorTest {
    @Test
    public void ShouldWriteSurvivorTextFileAfterPlayerWins() {
        //assemble
        File file = new File("Survivor.txt");
        if (file.exists()) {
            file.delete();
        }

        //act
        WriterSurvivor.main();

        //assert
        assertTrue(file.exists());
    }

}
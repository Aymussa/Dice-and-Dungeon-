import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class WriterWinner{
    public static void main(String[] args) {
        FileWriter myWriter = null;
        try {
            File myFile = new File("Winner.txt");

            if (myFile.createNewFile()) {
                System.out.println("New File created ");
            } else {
                System.out.println("File already exists.");
            }

            myWriter = new FileWriter(myFile);
            myWriter.write("""
                      __________________________________________________________
                      |                                                         |
                      |        Congratulations YOU have won the game . !!       |
                      | ________________________________________________________|  
                      |     -_-     ____      ____        ____              _-  |  
                      |_-_- _      |  _ \\   /  _ \\     |  _ \\       -_- _- - |
                      |            | | | |   >  _ </\\   | | | |                |\s
                      |            | |_| |  /  <_\\ \/   | |_| |    _-_         |\s
                      | -_-        |____/  \\_____\\ \\  |____/            _-   |\s
                      |                                                -_-      |
                      |      .-'````````'.        '(`        .-'```````'-.      |
                      |    .` |           `.      `)'      .` |           `.    |         \s
                      |   /   |   ()        \\      U      /   |    ()       \\ |
                      |  |    |    ;         | o   T   o |    |    ;         |  |
                      |  |    |     ;        |  .  |  .  |    |    ;         |  |
                      |  |    |     ;        |   . | .   |    |    ;         |  |
                      |  |    |     ;        |    .|.    |    |    ;         |  |
                      |  |    |____;_________|     |     |    |____;_________|  | \s
                      |  |   /  __ ;   -     |     !     |   /     `'() _ -  |  |
                      |  |  / __  ()        -|        -  |  /  __--      -   |  |
                      |  | /        __-- _   |   _- _ -  | /        __--_    |  |
                      |__|/__________________|___________|/__________________|__|
                     /                                             _ -        lc \\
                    /   -_- _ -             _- _---                       -_-  -_ \\
            """);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");

        } catch (IOException exception) {
            System.out.println("An IO expection occured");
        }
//            finally{
//                if (myWriter != null) {
//                    myWriter.close();
//                }
//            }
    }
}

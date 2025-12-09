import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class WriterDefeated {
    public static void main() {
        FileWriter myWriter = null;
        try {
            File myFile = new File("Defeated.txt");

            if (myFile.createNewFile()) {
                System.out.println("New File created ");
            } else {
                System.out.println("File already exists.");
            }

            myWriter = new FileWriter(myFile);

            myWriter.write(""" 
                       _________________________________________________________
                      |                                                         |
                      | You fought well, but at the end you have been defeated. |
                      | ________________________________________________________|
                      |     -_-     ____      ____        ____              _-  |\s
                      |_-_- _      |  _ \\   /  _ \\     |  _ \\       -_- _- - |\s
                      |            | | | |   >  _ </\\   | | | |                |\s
                      |            | |_| |  /  <_\\ \\/  | |_| |    _-_         |\s
                      | -_-        |____/  \\_____\\ \\  |____/            _-   |\s
                      |                                                -_-      |\s
                      |      .-'````````'.        '(`        .-'```````'-.      |\s
                      |    .` |           `.      `)'      .` |           `.    |
                      |   /   |   ()        \\      U      /   |    ()       \\ |\s
                      |  |    |    ;         | o   T   o |    |    ;         |  |
                      |  |    |     ;        |  .  |  .  |    |    ;         |  |
                      |  |    |     ;        |   . | .   |    |    ;         |  |
                      |  |    |     ;        |    .|.    |    |    ;         |  |
                      |  |    |____;_________|     |     |    |____;_________|  |
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
            System.out.println("An IO exception occurred");
        }
    }
}

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
            myWriter.write("Congratulations you have won the game");
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

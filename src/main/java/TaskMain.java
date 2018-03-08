import java.io.*;
import java.util.Scanner;

public class TaskMain {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner("C:\\Users\\Admin\\Desktop\\imie.txt");
        BufferedReader inputFile = null;
        int numberOfLines = 0;
        String line;

        try {
            inputFile = new BufferedReader(new FileReader(input.next()));

            while (true) {
                line = inputFile.readLine();
                if (line == null) {
                    break;
                }
                numberOfLines++;
                System.out.println(line);

            }
        }
           finally {
            if (inputFile != null) {
                inputFile.close();
            }
        }

        System.out.println(numberOfLines);
    }
}

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Change  {

    public ArrayList<String> createString(String source) throws IOException {

        Scanner input = new Scanner(source);
        Path path = Paths.get(input.nextLine());

        ArrayList<String> inputLines = (ArrayList<String>) Files.readAllLines(path);

        return inputLines;
    }

    public ArrayList<User> createList(ArrayList<String> list) {

        LocalDate today = LocalDate.now();
        ArrayList<User> users = new ArrayList<>();

        for (String line : list) {

            String[] lines = line.split(",");

            int cell = lines.length;

            LocalDate bdate = LocalDate.parse(lines[2]);

            long age = today.getYear() - bdate.getYear();

            if (cell == 4) {
                User user = new User(
                        lines[0],
                        lines[1],
                        age,
                        lines[3]
                );

                users.add(user);

            } else {
                User user = new User(
                        lines[0],
                        lines[1],
                        age
                );

                users.add(user);
            }
        }
        return users;
    }
}

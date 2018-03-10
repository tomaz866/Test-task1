import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Nowa {

    public static void main(String[] args) throws IOException {

        String source = "C:\\Users\\Admin\\Desktop\\imie.txt";

        Scanner input = new Scanner(source);
        Path path = Paths.get(input.nextLine());
        LocalDate today = LocalDate.now();
        User oldest = null;

        ArrayList<String> inputLines = (ArrayList<String>) Files.readAllLines(path);

        ArrayList<User> users = new ArrayList<>();
        for (String line : inputLines) {

            String[] lines = line.split(",");

            int cell = lines.length;

            LocalDate bdate = LocalDate.parse(lines[2]);

            long age = today.getYear() - bdate.getYear();

            if(cell == 4) {
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

        for(User user:users) {

            if(user.getPhone() != null) {

                if (oldest == null) {
                    oldest = user;
                }

                if (user.getAge() > oldest.getAge()) {
                    oldest = user;
                }
            }
        }

        System.out.println(oldest);

        System.out.println("Liczba użytkowników: " + users.size());
    }
}




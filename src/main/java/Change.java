import java.time.LocalDate;
import java.util.ArrayList;

public class Change  {

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

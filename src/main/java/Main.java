import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        String source = "C:\\Users\\Admin\\Desktop\\imie.txt";

        Change change = new Change();
        Search user = new Search();

        ArrayList<String> list = change.createString(source);

        ArrayList<User> userList = change.createList(list);

        User oldest = user.searchOldest(userList);

        System.out.println("Liczba użytkowników: " + userList.size());
        System.out.println(oldest);
    }
}




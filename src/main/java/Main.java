import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        System.out.print("Podaj ścieżkę do pliku: ");
        Path path = Paths.get(input.nextLine());

        ArrayList<String> inputLines = (ArrayList<String>) Files.readAllLines(path);

        Change change = new Change();
        Search search = new Search();

        ArrayList<User> userList = change.createList(inputLines);
        User oldest = search.searchOldest(userList);

        System.out.println("Liczba użytkowników: " + userList.size());
        System.out.println(oldest);
    }
}




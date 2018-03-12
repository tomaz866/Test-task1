import java.util.ArrayList;
import java.util.Comparator;
import java.util.NoSuchElementException;

public class Search {

    public User searchOldest(ArrayList<User> list) {

        User oldest = list.stream()
                .filter(o -> o.getPhone() != null)
                .max(Comparator.comparing(User::getAge))
                .orElseThrow(NoSuchElementException::new);

        return oldest;
    }
}

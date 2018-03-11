import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class SearchTest {

    @Test
    public void oldest() {
        //Given
        Search search = new Search();
        User user1 = new User("Ania","Fix",32,"456765432");
        User user2 = new User("Ewa","Olks",45,"675321987");
        User user3 = new User("Jola","Luks",48);
        ArrayList<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);

        //When
        User oldest = search.searchOldest(users);

        //Then
        Assert.assertEquals(45,oldest.getAge());
        Assert.assertEquals("Ewa",oldest.getName());
    }
}

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ChangeTest {

    @Test
    public void shouldCreate() {
        //Given
        Change change = new Change();
        String line1 = "Ewa,Kura,1987-04-23,435666987";
        String line2 = "Ola,Kliska,1990-02-14";
        ArrayList<String> lines = new ArrayList<>();
        lines.add(line1);
        lines.add(line2);

        //When
        ArrayList<User> users = change.createList(lines);

        //Then
        Assert.assertEquals(2,users.size());
        Assert.assertEquals(null,users.get(1).getPhone());
    }
}

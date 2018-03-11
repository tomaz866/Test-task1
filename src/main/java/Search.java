import java.util.ArrayList;

public class Search {

    public User searchOldest(ArrayList<User> list) {

        User oldest = null;

        for(User user:list) {

            if (user.getPhone() != null) {

                if (oldest == null) {
                    oldest = user;
                }

                if (user.getAge() > oldest.getAge()) {
                    oldest = user;
                }
            }
        }
        return oldest;
    }
}

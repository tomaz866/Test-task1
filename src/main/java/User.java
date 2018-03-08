import java.util.Date;

public class User {

    private String name;
    private String lastname;
    private Date birthday;
    private String phone;

    public User(String name, String lastname, Date birthday, String phone) {
        this.name = name;
        this.lastname = lastname;
        this.birthday = birthday;
        this.phone = phone;
    }

    public User(String name, String lastname, Date birthday) {
        this.name = name;
        this.lastname = lastname;
        this.birthday = birthday;
    }
}

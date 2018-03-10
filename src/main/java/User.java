
public class User {

    private String name;
    private String lastname;
    private long age;
    private String phone;

    public User(String name, String lastname, long age, String phone) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.phone = phone;
    }

    public User(String name, String lastname, long age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public long getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }
}

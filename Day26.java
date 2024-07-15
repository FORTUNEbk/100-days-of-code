public class Day26 {
    private String firstname;
    private String lastname;
    private String email;

    public Day26(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Day26(String email) {
        this.email = email;
    }

    public Day26(String firstname, String lastname, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Day26 user1 = new Day26("John", "Muchiri");
        Day26 user2 = new Day26("john.muchiri@gmail.com");
        Day26 user3 = new Day26("Jane", "wangoi", "jane.wangoigmail.com");

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
    }
}

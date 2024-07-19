abstract class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract void displayUserInfo();
}

class AdminUser extends User {

    public AdminUser(String name, String email) {
        super(name, email);
    }

    @Override
    public void displayUserInfo() {
        System.out.println("Admin User - Name: " + getName());
        System.out.println("Admin User - Email: " + getEmail());
    }
}

public class Day30 {
    public static void main(String[] args) {
        User admin = new AdminUser("Kanyangi Fortune", "kanyangif@gmail.com");
        admin.displayUserInfo();
    }
}

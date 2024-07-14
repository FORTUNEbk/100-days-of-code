public class Day25 {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String city;
    private String country;

    // Constructor
    public Day25(int id, String firstName, String lastName, String email, String city, String country) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.city = city;
        this.country = country;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    // Method to get full name
    public String getFullname() {
        return this.firstName + " " + this.lastName;
    }

    public static void main(String[] args) {
        
        Day25 user = new Day25(1, "Fortune", "Kanyangi", "kanyangif@gmail.com", "Nairobi", "Kenya");
        System.out.println("User ID: " + user.getId());
        System.out.println("Full Name: " + user.getFullname());
        System.out.println("Email: " + user.getEmail());
        System.out.println("City: " + user.getCity());
        System.out.println("Country: " + user.getCountry());
    }
}

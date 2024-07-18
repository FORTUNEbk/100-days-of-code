public class Day29 {

    public static class User {
        private String firstname;
        private String lastname;

        public User(String firstname, String lastname) {
            this.firstname = firstname;
            this.lastname = lastname;
        }

        public String getFirstname() {
            return firstname;
        }

        public String getLastname() {
            return lastname;
        }

        public String getFullname() {
            return firstname + " " + lastname;
        }
    }

    public static class Instructor extends User {

        public Instructor(String firstname, String lastname) {
            super(firstname, lastname);
        }

        @Override
        public String getFullname() {
            return "Prof. " + getFirstname() + " " + getLastname();
        }
    }

    public static void main(String[] args) {
        User user = new User("Fortune", "Kanyangi");
        System.out.println(user.getFullname());

        Instructor instructor = new Instructor("Jane", "Mwirigi");
        System.out.println(instructor.getFullname()); 
    }
}

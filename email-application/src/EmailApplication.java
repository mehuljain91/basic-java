package emailapp;

public class EmailApplication {

    public static void main(String[] args) {
        
        // em1 object of Email class
        Email em1 = new Email("John", "Doe");
        System.out.println(em1.showInfo());
    }
}

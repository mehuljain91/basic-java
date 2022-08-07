package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private int mailBoxCapacity = 500;
    private String email;
    private String companySuffix = "xyzcompany.com";
    
    // Constructor with firstname and lastname as parameters
    
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        
        this.department = setDepartment();
        
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);
        
        // Email with company department
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
    }
    
    // Set Department with code input by the user
    private String setDepartment() {
        System.out.println("Enter Department Code\n1 for Sales\n2 for Development\n3 for Finance\n4 for Operations\nEnter Department Code");
        Scanner in = new Scanner(System.in);
        int dep = in.nextInt();
        switch (dep) {
            case 1:
                return "sales";
            case 2:
                return "dev";
            case 3:
                return "fin";
            case 4:
                return "ops";
            default:
                return "";
        }
    }
    
    // Generate random password with default length 10
    private String randomPassword(int length) {
        String passwordChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789().!-@$#%^&*_=+/?:;";
        char[] password = new char[length];
        for(int i = 0; i < length; i++) {
            int rand = (int)(Math.random() * passwordChars.length());
            password[i] = passwordChars.charAt(rand);
        }
        return new String(password);
    }
    
    public void mailBoxCapacity(int capacity) {
        this.mailBoxCapacity = capacity;
    }
    
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }
    
    public void changePassword(String password) {
        this.password = password;
    }
    
    public int getMainBoxCapacity() {
        return mailBoxCapacity;
    }
    
    public String getAlternateEmail() {
        return alternateEmail;
    }
    
    public String getPassword() {
        return password;
    }
    
    // Show info Full Name, Company Email and Mailbox Capacity
    public String showInfo() {
        return "Full Name: " + firstName + " " + lastName + "\nCompany Email; " + email + "\nMailBoxCapaciy: " + mailBoxCapacity;
    }
}

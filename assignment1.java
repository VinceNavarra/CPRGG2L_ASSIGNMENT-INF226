import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // Java program to check if a student number is valid
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Email Address: ");
        String studentemail = scan.nextLine();

        // Long method
        Pattern pattern = Pattern.compile("\\w+@students.national-u.edu.ph");
        Matcher matcher = pattern.matcher(studentemail);

        boolean match = matcher.matches();

        if (match) {
            System.out.println("valid Email Address");
        } else {
            System.out.println("invalid Email Address");
        }
    
        // Java program to check if a student number is valid
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Enter Cellphone Number: ");
        String cellphonenumber = scan1.nextLine();

        // Long method
        Pattern pattern1 = Pattern.compile("\\+63\\d{10}");
        Matcher matcher1 = pattern1.matcher(cellphonenumber);

        boolean match1 = matcher1.matches();

        if (match) {
            System.out.println("valid cellphone number");
        } else {
            System.out.println("invalid cellphone number");
        }
    

        // Java program to check if a student number is valid
        scan = new Scanner(System.in);
        System.out.print("Enter Birth Date: ");
        String birthdate = scan.nextLine();

        // Long method
        pattern = Pattern.compile("\\d{4}-\\d{2}-\\d{2}");
        matcher = pattern.matcher(birthdate);

        match = matcher.matches();

        if (match) {
            System.out.println("valid birth date");
        } else {
            System.out.println("invalid birth date");
        }

        scan.close();
    }
}

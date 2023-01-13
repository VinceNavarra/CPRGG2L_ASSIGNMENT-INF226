import java.util.Scanner;

public class Exercise2{

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        test("Driving Lessons");
        scan.close();
    }

    static void test(String driving) {

        System.out.println("Driving Lesson");
        learn(driving);

        String feedback = getFeedBack(driving);

        // Define the base case / stopping condition
        if (feedback.equals("no")) {

            // Do something to reach the goal
            DriveImprove(driving);

            // Recursive call
            test(driving);
        } else if (feedback.equals("yes")) {
            lesson(driving);
        }
    }

    static void learn(String driving) {
        System.out.println("Test Drive");
    }

    static String getFeedBack(String driving) {
        System.out.println("Is the " + driving + " successful "+" ? (Enter \"yes\" or \"no\")");

        String feedback = scan.next();

        return feedback;
    }

    static void DriveImprove(String driving) {
        System.out.print("What skills do you want to improve?:");
        String test = scan.next();
        System.out.println("Fixing driving skills. Added " + test);
    }

    static void lesson(String driving) {
        System.out.println("Successful " + driving);
    }

}
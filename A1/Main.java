import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if (args.length >= 1) {
            if (args[0].toLowerCase().equalsIgnoreCase("test")) {
                TestCases tc = new TestCases();
                tc.executeTests();
            } else {
                System.out.println("We are in non-test part");
            }
        } else {
            initiateSystem();
        }
    }

    static UserLoginInterface auth;

    public static void initialize() {
        auth = new LoginAPI();
    }

    public static void clearScreen() {

        System.out.print("\033[H\033[2J");

        System.out.flush();

    }

    static void initiateSystem() {
        initialize();
        System.out.println("-------------------------");
        System.out.println("Welcome to Walmart");
        System.out.println("-------------------------");
        User user = new User();
        System.out.println("To login enter your details");
        System.out.println("Use credentials as below");
        System.out.println("Username: Khushi");
        System.out.println("Password: kshah2699");
        System.out.println("Please enter your username");
        Scanner sc = new Scanner(System.in);
        user.setUserName(sc.nextLine());
        System.out.println("Please enter your password");
        user.setPassword(sc.nextLine());
        UserLoginInterface.AuthenticationResult result = user.login(auth);
        System.out.println("-------------------------");
        if (result.toString().equalsIgnoreCase("FAILURE") ||
                result.toString().equalsIgnoreCase("INCORRECT_PASSWORD") ||
                result.toString().equalsIgnoreCase("UNKNOWN_USER")) {
            clearScreen();
            System.out.println("-------------------------");
            System.out.println(result + "  Login Again!!");

            initiateSystem();
        } else {
            MainScreen mS = new MainScreen();
            mS.mainScreen(result,user);
       }
    }
}
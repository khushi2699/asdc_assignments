public class UserTest {
    static UserLoginInterface auth;

    public static void initialize() {
        auth = new LoginAPI();
    }


    public void loginUnknownUserTest(){
        initialize();
        User user = new User();
        user.setUserName("Admin123");
        user.setPassword("Kshah2699");
        UserLoginInterface.AuthenticationResult result = user.login(auth);
        if(result.toString().equalsIgnoreCase("UNKNOWN_USER"))
        {
            System.out.println("Unknown User test passed");
        }
    }

    public void loginIncorrectPasswordTest(){
        initialize();
        User user = new User();
        user.setUserName("Khushi");
        user.setPassword("kshah269");
        UserLoginInterface.AuthenticationResult result = user.login(auth);
        if(result.toString().equalsIgnoreCase("INCORRECT_PASSWORD")){
            System.out.println("Incorrect Password test passed");
        }
    }
    public void loginSuccessTest(){
        initialize();
        User user = new User();
        user.setUserName("Khushi");
        user.setPassword("kshah2699");
        UserLoginInterface.AuthenticationResult result = user.login(auth);
        if(result.toString().equalsIgnoreCase("SUCCESS")){
            System.out.println("Login Succesfull test passed");
        }
    }
}

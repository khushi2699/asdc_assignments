import java.sql.SQLOutput;

public class MainScreenTest {

    static UserLoginInterface auth;

    public static void initialize() {
        auth = new LoginAPI();
    }
    public void testYorNTest(){
        initialize();

        User user = new User();
        user.setUserName("Khushi");
        user.setPassword("kshah2699");

        UserLoginInterface.AuthenticationResult result = user.login(auth);
        MainScreen ms = new MainScreen();
        if(ms.mainScreen(result,user)){
            System.out.println("---Test Y and N success");
        }
    }
}

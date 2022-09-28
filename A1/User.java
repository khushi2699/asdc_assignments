import java.sql.SQLOutput;

public class User {

    private String userName;
    private String password;

    public User(){
        userName = null;
        password = null;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public UserLoginInterface.AuthenticationResult login(UserLoginInterface auth){
        return auth.login(getUserName(), getPassword());
    }

}

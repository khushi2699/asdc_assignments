public class LoginAPI implements UserLoginInterface
{
    public AuthenticationResult login(String userName, String password)
    {
        if (userName.equals("Khushi"))
        {
            if (password.equals("kshah2699"))
            {
                return UserLoginInterface.AuthenticationResult.SUCCESS;
            }
            else
            {
                return UserLoginInterface.AuthenticationResult.INCORRECT_PASSWORD;
            }
        }
        else if (userName.equals("failure"))
        {
            return UserLoginInterface.AuthenticationResult.FAILURE;
        }
        return UserLoginInterface.AuthenticationResult.UNKNOWN_USER;
    }
}

public interface UserLoginInterface {
    public enum AuthenticationResult
    {
        SUCCESS,
        INCORRECT_PASSWORD,
        UNKNOWN_USER,
        FAILURE
    }

    public AuthenticationResult login(String userName, String password);
}

public class AsteroidImpact extends Subject{

    private static AsteroidImpact instance = null;

    public static AsteroidImpact Instance()
    {
        if (null == instance)
        {
            instance = new AsteroidImpact();
        }
        return instance;
    }
}

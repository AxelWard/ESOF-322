public class NoSQLDB implements DatabaseApp
{
    public NoSQLDB()
    {

    }

    public void store()
    {
        System.out.println("Uses document store.");
    }

    public String getType() {
        return ("NoSQLDB");
    }
}
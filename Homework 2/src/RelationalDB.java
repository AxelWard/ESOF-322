public class RelationalDB implements DatabaseApp
{
    public RelationalDB()
    {

    }

    public void store()
    {
        System.out.println("Uses Table Store.");
    }

    public String getType()
    {
        return("RelationalDB");
    }
}
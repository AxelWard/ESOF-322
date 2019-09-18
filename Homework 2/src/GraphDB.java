public class GraphDB implements DatabaseApp
{
    public GraphDB()
    {

    }

    public void store()
    {
        System.out.println("Uses Node Store.");
    }

    public String getType()
    {
        return("GraphDB");
    }
}
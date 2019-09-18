public class DBTool
{
    private DatabaseApp A;

    DBTool(DatabaseApp da)
    {
        A = da;
    }

    public void performStore()
    {
        this.A.store();
    }

    public void setDatabase(DatabaseApp a)
    {
        this.A = a;
        System.out.println("Database is now " + a.getType());
    }
}

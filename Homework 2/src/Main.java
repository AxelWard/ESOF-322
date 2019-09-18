public class Main {
    public static void main(String args[])
    {
        DBTool database = new DBTool(new RelationalDB());
        database.performStore();

        database.setDatabase(new GraphDB());
        database.performStore();

        database.setDatabase(new NoSQLDB());
        database.performStore();
    }
}

public class Main {
    public static void main(String args[])
    {
        DBTool database = new DBTool(new RelationalDB());

        RelationalDB rdb = new RelationalDB();
        NoSQLDB ndb = new NoSQLDB();
        GraphDB gdb = new GraphDB();

        database.performStore();
        ndb.store();
        gdb.store();

    }
}

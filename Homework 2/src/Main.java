public class Main {
    public static void main(String args[])
    {
        System.out.println("Hi!");
        RelationalDB rdb = new RelationalDB();
        NoSQLDB ndb = new NoSQLDB();
        GraphDB gdb = new GraphDB();

        rdb.store();
        ndb.store();
        gdb.store();

    }
}

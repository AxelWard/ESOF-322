public class Main {
    public static void main(String args[])
    {
        System.out.println("Please select a Database Software!");
        System.out.println("...");
        System.out.println("You have selected to store your data using a Relational Database!");
        DBTool database = new DBTool(new RelationalDB());

        database.performStore("Relational Data");

        System.out.println("We are going to back your data up in a NoSQLDB as well!");

        database.setStoreStrategy(new GraphDB());

        database.performStore("Graph Data");

        System.out.println("*****Verification the graph database works independently*****");

        NoSQLDB ndb = new NoSQLDB();


//        ndb.store();
        ndb.store("NoSQL Data");

    }
}

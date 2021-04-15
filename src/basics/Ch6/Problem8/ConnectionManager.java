package basics.Ch6.Problem8;
import static util.Print.*;

class Connection{
    private Connection(){
        println("Connection construction");
    }
    static Connection getConnection(){
        return new Connection();
    }
}

public class ConnectionManager {
    private static final Connection[] cons = new Connection[]{Connection.getConnection(), Connection.getConnection()};
    public static Connection getConnection(){
        return cons[0];
    }
}


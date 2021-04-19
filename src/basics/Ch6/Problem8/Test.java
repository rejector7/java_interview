package basics.Ch6.Problem8;

public class Test {
    public static void main(String[] args){
        Connection cm = ConnectionManager.getConnection();
        cm.run();
        Connection.main();
        Singleton s = Singleton.getSingleton();
        s.run();

    }
}

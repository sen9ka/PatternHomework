package proxy;

public class Main {
    public static void main(String[] args) {
        DBInfo dbInfo = new DBInfo();
        DBInfoProxy dbInfoProxy = new DBInfoProxy(dbInfo);
        dbInfoProxy.ConnectToDB();
    }
}

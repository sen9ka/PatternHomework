package proxy;

public class DBInfoProxy implements IDBConnector{

    private final DBInfo dbInfo;
    String FullDBName = "localhost:port/";

    public DBInfoProxy(DBInfo dbInfo) {
        this.dbInfo = dbInfo;
    }

    @Override
    public void ConnectToDB() {
        System.out.println("Считываю имя базы данных");
        System.out.println("Пытаюсь подключиться по адресу " + FullDBName + dbInfo.getDBName());
    }
}

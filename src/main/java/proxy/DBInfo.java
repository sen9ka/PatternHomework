package proxy;

public class DBInfo implements IDBConnector{

    String DBName = "HomeworkDB";

    @Override
    public void ConnectToDB() {
        System.out.println("Пытаюсь подключиться по названию");
        System.out.println("Подключение к базе данных " + DBName);
    }

    public String getDBName() {
        return DBName;
    }
}

package singleton;

public class Runner {
    public static void main(String[] args) {
        Logger.getLogger().addLogInfo("First log...");
        Logger.getLogger().addLogInfo("Second log...");
        Logger.getLogger().addLogInfo("Third log...");

        Logger.getLogger().showLogFile();
    }
}

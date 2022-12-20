package adapter;

public class Main {
    public static void main(String[] args) {

        IUSB USBAdapter = new USBAdapter(new MemoryCard());
        USBAdapter.connectViaUSB();

    }
}

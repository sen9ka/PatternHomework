package apapter;

public class USBAdapter implements  IUSB{
    private MemoryCard memoryCard;

    public USBAdapter(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    @Override
    public void connectViaUSB() {
        this.memoryCard.insertCard();
        this.memoryCard.readData();
    }
}

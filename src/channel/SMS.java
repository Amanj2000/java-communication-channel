package channel;

public class SMS implements Channel {

    @Override
    public void sendMessage() {
        System.out.println("Message sent through SMS.");
    }
}

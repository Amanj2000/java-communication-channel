package channel;

public class Call implements Channel {

    @Override
    public void sendMessage() {
        System.out.println("Message sent through call.");
    }
}

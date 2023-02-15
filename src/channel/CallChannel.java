package channel;

public class CallChannel implements Channel {

    @Override
    public void sendMessage() {
        System.out.println("Message sent through call.");
    }

    @Override
    public String getMedium() {
        return "call";
    }
}

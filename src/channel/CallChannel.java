package channel;

public class CallChannel implements Channel {

    @Override
    public void sendMessage(String message) {
        System.out.printf("Message: %s sent through call.\n", message);
    }

    @Override
    public String getMedium() {
        return "call";
    }
}

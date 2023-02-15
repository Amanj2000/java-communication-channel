package channel;

public class SMSChannel implements Channel {

    @Override
    public void sendMessage() {
        System.out.println("Message sent through SMS.");
    }

    @Override
    public String getMedium() {
        return "sms";
    }
}

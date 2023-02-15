package channel;

public class SMSChannel implements Channel {

    @Override
    public void sendMessage(String message) {
        System.out.printf("Message: %s sent through sms.\n", message);
    }

    @Override
    public String getMedium() {
        return "sms";
    }
}

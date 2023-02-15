package channel;

public class EmailChannel implements Channel {

    @Override
    public void sendMessage(String message) {
        System.out.printf("Message: %s sent through e-mail.\n", message);
    }

    @Override
    public String getMedium() {
        return "e-mail";
    }
}

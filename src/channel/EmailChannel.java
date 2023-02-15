package channel;

public class EmailChannel implements Channel {

    @Override
    public void sendMessage() {
        System.out.println("Message sent through e-mail.");
    }

    @Override
    public String getMedium() {
        return "e-mail";
    }
}

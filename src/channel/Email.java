package channel;

public class Email implements Channel {

    @Override
    public void sendMessage() {
        System.out.println("Message sent through e-mail.");
    }
}

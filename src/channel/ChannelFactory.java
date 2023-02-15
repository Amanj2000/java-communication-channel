package channel;

public class ChannelFactory {
    public Channel createChannel(String channel) {
        switch(channel) {
            case "sms":
                return new SMSChannel();
            case "e-mail":
                return new EmailChannel();
            case "call":
                return new CallChannel();
            default:
                System.out.println("error: invalid channel name.");
                return null;
        }
    }
}

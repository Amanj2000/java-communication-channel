package channel;

public class ChannelFactory {
    public static Channel createChannel(ChannelType channel) {
        switch(channel) {
            case EMAIL:
                return new EmailChannel();
            case SMS:
                return new SMSChannel();
            case CALL:
                return new CallChannel();
            default:
                System.out.println("error: invalid or empty channel name " + channel);
                return null;
        }
    }
}

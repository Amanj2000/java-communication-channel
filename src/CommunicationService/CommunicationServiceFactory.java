package CommunicationService;

import channel.ChannelType;

public class CommunicationServiceFactory {
    public static CommunicationService createCommunicationService(ChannelType channel) {
        switch(channel) {
            case EMAIL:
                return new EmailCommunicationService();
            case SMS:
                return new TextCommunicationService();
            case CALL:
                return new CallCommunicationService();
            default:
                return null;
        }
    }
}

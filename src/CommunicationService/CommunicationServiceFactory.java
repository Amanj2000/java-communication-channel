package CommunicationService;

import channel.ChannelType;

public class CommunicationServiceFactory {
    public static CommunicationService createCommunicationService(ChannelType channelType) {
        switch(channelType) {
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

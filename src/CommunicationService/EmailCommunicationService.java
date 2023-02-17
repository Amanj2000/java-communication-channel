package CommunicationService;

import channel.ChannelType;

class EmailCommunicationService extends CommunicationService {
    public EmailCommunicationService() {
        super(ChannelType.EMAIL);
    }

    @Override
    String display() {
        return String.format("CommunicationApp Service: Email \t Channel Type: %s", super.channel.getMedium());
    }
}

package CommunicationService;

import channel.ChannelType;

class TextCommunicationService extends CommunicationService {
    public TextCommunicationService() {
        super(ChannelType.SMS);
    }

    @Override
    String display() {
        return String.format("CommunicationApp Service: Text \t Channel Type: %s", super.channel.getMedium());
    }
}

package CommunicationService;

import channel.ChannelType;

class TextCommunicationService extends CommunicationService {
    public TextCommunicationService() {
        super(ChannelType.SMS);
    }

    @Override
    String display() {
        return "using text communication service";
    }
}

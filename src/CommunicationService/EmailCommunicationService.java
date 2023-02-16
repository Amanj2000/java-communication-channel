package CommunicationService;

import channel.ChannelType;

class EmailCommunicationService extends CommunicationService {
    public EmailCommunicationService() {
        super(ChannelType.EMAIL);
    }

    @Override
    String display() {
        return "using e-mail communication service";
    }
}

package CommunicationService;

import channel.ChannelType;

class CallCommunicationService extends CommunicationService{
    public CallCommunicationService() {
        super(ChannelType.CALL);
    }

    @Override
    String display() {
        return "using call communication service";
    }
}

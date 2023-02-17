package CommunicationService;

import channel.ChannelType;

class CallCommunicationService extends CommunicationService{
    public CallCommunicationService() {
        super(ChannelType.CALL);
    }

    @Override
    String display() {
        return String.format("CommunicationApp Service: Call \t Channel Type: %s", super.channel.getMedium());
    }
}

package CommunicationService;

import channel.Channel;
import channel.ChannelFactory;
import channel.ChannelType;

public abstract class CommunicationService {
    protected Channel channel;

    protected CommunicationService(ChannelType channelType) {
        this.channel = ChannelFactory.createChannel(channelType);
    }

    public void sendMessage(String message) {
        this.channel.sendMessage(message);
    }

    abstract String display();
}

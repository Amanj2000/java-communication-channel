package CommunicationService;

import channel.Channel;
import channel.ChannelFactory;
import channel.ChannelType;

public abstract class CommunicationService {
    protected Channel channel;

    protected CommunicationService(ChannelType ch) {
        this.channel = ChannelFactory.createChannel(ch);
    }

    protected void sendMessage(String message) {
        this.channel.sendMessage(message);
    }

    abstract String display();
}

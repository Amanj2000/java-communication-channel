package CommunicationService;

import channel.Channel;

public abstract class ICommunicationService {
    protected Channel channel;

    protected ICommunicationService(Channel channel) {
        this.channel = channel;
    }

    abstract public void sendMessage(String message);
    abstract public String display();
}

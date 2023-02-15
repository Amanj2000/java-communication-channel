import channel.Channel;
import channel.ChannelFactory;

import java.util.ArrayList;
import java.util.HashMap;

public class Preferences {
    private final ChannelFactory channelFactory;
    private HashMap<String, Channel> channels;

    public Preferences(ArrayList<String> channels) {
        this.channelFactory = new ChannelFactory();
        init(channels);
    }

    private void init(ArrayList<String> channels) {
        this.channels = new HashMap<>();
        for(String ch : channels) {
            Channel channel = channelFactory.createChannel(ch);
            if(channel != null) {
                this.channels.put(channel.getMedium(), channel);
            }
        }
    }

    public void addChannel(String ch) {
        if(!channels.containsKey(ch)) {
            Channel channel = channelFactory.createChannel(ch);
            if(channel != null) {
                this.channels.put(channel.getMedium(), channel);
            }
        }
    }

    public void removeChannel(String ch) {
        channels.remove(ch);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(String ch: channels.keySet()) {
            sb.append(ch).append(" ");
        }
        return sb.toString();
    }
}

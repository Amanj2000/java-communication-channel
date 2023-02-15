import channel.Channel;
import channel.ChannelFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Preferences {
    private final ChannelFactory channelFactory;
    private HashMap<String, Channel> channels;

    public Preferences(List<String> channels) {
        this.channelFactory = new ChannelFactory();
        init(channels);
    }

    private void init(List<String> channels) {
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

    public List<Channel> getChannels() {
        return new ArrayList<>(channels.values());
    }

    @Override
    public String toString() {
        if(channels.isEmpty()) return "none";

        StringBuilder sb = new StringBuilder();
        for(String ch: channels.keySet()) {
            sb.append(ch).append(", ");
        }
        return sb.substring(0, sb.length()-2);
    }
}

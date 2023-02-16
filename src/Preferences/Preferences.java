package Preferences;

import channel.Channel;
import channel.ChannelFactory;
import channel.ChannelType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Preferences {
    private final HashMap<ChannelType, Channel> channels;

    Preferences() {
        channels = new HashMap<>();
    }

    public void addChannel(ChannelType ch) {
        if(!channels.containsKey(ch)) {
            Channel channel = ChannelFactory.createChannel(ch);
            if(channel != null) {
                this.channels.put(channel.getMedium(), channel);
            }
        }
    }

    public void removeChannel(ChannelType ch) {
        channels.remove(ch);
    }

    public List<Channel> getChannels() {
        return new ArrayList<>(channels.values());
    }

    @Override
    public String toString() {
        if(channels.isEmpty()) return "none";

        StringBuilder sb = new StringBuilder();
        for(ChannelType ch: channels.keySet()) {
            sb.append(ch).append(", ");
        }
        return sb.substring(0, sb.length()-2);
    }
}

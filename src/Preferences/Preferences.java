package Preferences;

import channel.ChannelType;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Preferences {
    private final HashSet<ChannelType> channels;

    public Preferences() {
        channels = new HashSet<>();
    }

    public void addChannel(ChannelType channelType) {
        channels.add(channelType);
    }

    public void removeChannel(ChannelType channelType) {
        channels.remove(channelType);
    }

    public List<ChannelType> getChannels() {
        return new ArrayList<>(channels);
    }

    @Override
    public String toString() {
        if(channels.isEmpty()) return "none";

        StringBuilder sb = new StringBuilder();
        for(ChannelType ch: channels) {
            sb.append(ch).append(", ");
        }
        return sb.substring(0, sb.length()-2);
    }
}

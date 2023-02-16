import CommunicationService.CommunicationService;
import CommunicationService.CommunicationServiceFactory;
import Preferences.Preferences;
import channel.Channel;
import channel.ChannelType;

import java.util.ArrayList;
import java.util.List;

public class Communication {
    private final PreferenceDB preferenceDB;

    public Communication() {
        preferenceDB = new PreferenceDB();
    }

    public void optIn(User user, ChannelType channelType) {
        preferenceDB.optIn(user, channelType);
    }

    public void optOut(User user, ChannelType channelType) {
        preferenceDB.optOut(user, channelType);
    }

    public void registerUser(User user) {
        registerUser(user, new ArrayList<>());
    }

    public void registerUser(User user, List<ChannelType> channels) {
        preferenceDB.addEntry(user, channels);
    }

    public String sendMessage(User sender, User receiver, String message) {
        List<ChannelType> preferences = preferenceDB.getPreferences(receiver);
        if(preferences.isEmpty()) {
            return String.format("Receiver %s is not opt-in for any service\n", receiver.getName());
        }

        for(ChannelType ch: preferences) {
            CommunicationService communicationService = CommunicationServiceFactory.createCommunicationService(ch);
            if(communicationService != null) {
                communicationService.sendMessage(message);
            }
        }
        return String.format("User %s sent message %s to receiver %s by {%s} channels\n", sender.getName(), message,
                receiver.getName(), preferences);
    }

    public String info(User user) {
        return String.format("User: \t name: %s \t preferences: %s", user.getName(), preferenceDB.getPreferences(user));
    }
}

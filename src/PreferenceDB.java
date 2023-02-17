import Preferences.Preferences;
import Preferences.IPreferencesBuilder;
import Preferences.PreferencesBuilderImpl;
import channel.ChannelType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class PreferenceDB {
    // stores user id and its corresponding preferences
    private static final HashMap<Integer, Preferences> preferencesData = new HashMap<>();

    public void addEntry(User user, List<ChannelType> channels) {
        IPreferencesBuilder preferencesBuilder = new PreferencesBuilderImpl();
        for(ChannelType ch: channels) {
            preferencesBuilder.addPreference(ch);
        }
        preferencesData.put(user.getId(), preferencesBuilder.getPreferences());
    }

    public void optIn(User user, ChannelType channel) {
        int userId = user.getId();
        if(!preferencesData.containsKey(userId)) {
            addEntry(user, new ArrayList<>(Collections.singleton(channel)));
        } else {
            preferencesData.get(userId).addChannel(channel);
        }
    }

    public void optOut(User user, ChannelType channel) {
        int userId = user.getId();
        if(preferencesData.containsKey(userId)) {
            preferencesData.get(userId).removeChannel(channel);
        }
    }

    public List<ChannelType> getPreferences(User user) {
        int userId = user.getId();
        if(preferencesData.containsKey(userId)) {
            return preferencesData.get(userId).getChannels();
        } else {
            return new ArrayList<>();
        }
    }

    public String info(User user) {
        return String.format("name: %s \t preferences: %s", user.getName(), preferencesData.getOrDefault(user.getId()
                , new Preferences()));
    }
}

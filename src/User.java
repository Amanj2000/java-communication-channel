import Preferences.Preferences;
import Preferences.PreferencesBuilder;
import Preferences.PreferencesBuilderImpl;
import channel.ChannelType;

import java.util.List;

public class User {
    private final String name;
    private final Preferences preferences;

    public User(String name, List<ChannelType> preferences) {
        this.name = name;
        this.preferences = init(preferences);
    }

    private Preferences init(List<ChannelType> preferences) {
        PreferencesBuilder preferencesBuilder = new PreferencesBuilderImpl();
        for(ChannelType p: preferences) {
            preferencesBuilder.addPreference(p);
        }
        return preferencesBuilder.getPreferences();
    }

    public void optIn(ChannelType channel) {
        preferences.addChannel(channel);
    }

    public void optOut(ChannelType channel) {
        preferences.removeChannel(channel);
    }

    public String getName() {
        return name;
    }

    public Preferences getPreferences() {
        return preferences;
    }

    @Override
    public String toString() {
        return String.format("Name: %s \t Preferences: %s", name, preferences);
    }
}

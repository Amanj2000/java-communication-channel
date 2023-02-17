package Preferences;

import channel.ChannelType;

public interface IPreferencesBuilder {
    void addPreference(ChannelType channel);
    Preferences getPreferences();
}

package Preferences;

import channel.ChannelType;

public interface PreferencesBuilder {
    void addPreference(ChannelType channel);
    Preferences getPreferences();
}

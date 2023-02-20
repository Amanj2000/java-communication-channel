package Preferences;

import channel.ChannelType;

public class PreferencesBuilderImpl implements IPreferencesBuilder {
    private final Preferences preferences;

    public PreferencesBuilderImpl() {
        this.preferences = new Preferences();
    }

    @Override
    public void addPreference(ChannelType channelType) {
        this.preferences.addChannel(channelType);
    }

    @Override
    public Preferences getPreferences() {
        return this.preferences;
    }
}

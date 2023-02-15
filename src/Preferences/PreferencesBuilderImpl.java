package Preferences;

public class PreferencesBuilderImpl implements PreferencesBuilder{
    private final Preferences preferences;

    public PreferencesBuilderImpl() {
        this.preferences = new Preferences();
    }

    @Override
    public void addPreference(String channel) {
        this.preferences.addChannel(channel);
    }

    @Override
    public Preferences getPreferences() {
        return this.preferences;
    }
}

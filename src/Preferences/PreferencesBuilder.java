package Preferences;

public interface PreferencesBuilder {
    void addPreference(String channel);
    Preferences getPreferences();
}

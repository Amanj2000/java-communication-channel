import java.util.ArrayList;

public class User {
    private final String name;
    private final Preferences preferences;

    public User(String name, ArrayList<String> preferences) {
        this.name = name;
        this.preferences = new Preferences(preferences);
    }

    public void addPreference(String channel) {
        preferences.addChannel(channel);
    }

    public void removePreference(String channel) {
        preferences.removeChannel(channel);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("Name: %s \t Preferences: %s", name, preferences);
    }
}

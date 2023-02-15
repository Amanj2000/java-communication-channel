import channel.Channel;

public class Communication {
    public String communicate(User sender, User receiver, String message) {
        Preferences preferences = receiver.getPreferences();
        if(preferences.getChannels().isEmpty()) {
            return String.format("Receiver %s is not opt-in for any service", receiver.getName());
        }

        for(Channel ch: preferences.getChannels()) {
            ch.sendMessage(message);
        }
        return String.format("User %s sent message %s to receiver %s by {%s} channels", sender.getName(), message,
                receiver.getName(), preferences);
    }
}

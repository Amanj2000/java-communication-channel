package channel;

public interface Channel {
    void sendMessage(String message);
    String getMedium();
}

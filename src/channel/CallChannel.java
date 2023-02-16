package channel;

class CallChannel implements Channel {

    @Override
    public void sendMessage(String message) {
        System.out.printf("Message: %s sent through call.\n", message);
    }

    @Override
    public ChannelType getMedium() {
        return ChannelType.CALL;
    }
}

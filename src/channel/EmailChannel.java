package channel;

class EmailChannel implements Channel {

    @Override
    public void sendMessage(String message) {
        System.out.printf("Message: %s sent through e-mail.\n", message);
    }

    @Override
    public ChannelType getMedium() {
        return ChannelType.EMAIL;
    }
}

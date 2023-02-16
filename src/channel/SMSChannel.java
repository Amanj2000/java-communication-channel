package channel;

class SMSChannel implements Channel {

    @Override
    public void sendMessage(String message) {
        System.out.printf("Message: %s sent through sms.\n", message);
    }

    @Override
    public ChannelType getMedium() {
        return ChannelType.SMS;
    }
}

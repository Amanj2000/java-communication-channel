package CommunicationService;

import channel.Channel;

public class CommunicationService extends ICommunicationService {
	public CommunicationService(Channel channel) {
		super(channel);
	}

	@Override
	public void sendMessage(String message) {
		super.channel.sendMessage(message);
	}

	@Override
	public String display() {
		return String.format("Channel type: %s", super.channel.getMedium());
	}
}

package ba.bitcamp.chatProject4;

public class Message {

	private String sender;
	private String content;

	public Message(String sender, String content) {
		this.sender = sender;
		this.content = content;
	}

	public String getMessage() {
		return String.format("%s : %s\n", sender, content);
	}
}
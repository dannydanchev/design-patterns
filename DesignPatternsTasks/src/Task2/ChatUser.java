package Task2;

public class ChatUser extends User{

	public ChatUser(ChatRoom mediator, String name) {
		super(mediator, name);
		mediator.addUser(this);
	}

	@Override
	public void send(String message) {
		if(message == "addBot") {
			ChatBot bot = ChatBot.getInstance();
		}
		System.out.println(this.name + " sends: " + message);
		this.mediator.sendMessage(message, this);
		
	}

	@Override
	public void receive(String message) {
		System.out.println(this.name + " received: " + message);
		
	}

}

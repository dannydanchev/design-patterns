package Task2;

public class ChatBot extends User{
	
	private static ChatBot instance;
	private Boolean justAdded = true;
	
	private ChatBot(ChatRoom mediator, String name) {
		super(mediator, name);
		mediator.addUser(this);
	}
	
	public static ChatBot getInstance() {
		if(instance == null) {
			instance = new ChatBot(mediator, "Bot");
		}
		
		return instance;
	}

	@Override
	public void send(String message) {
		System.out.println(this.name + " sends: " + message);
		this.mediator.sendMessage(message, this);
		
	}

	@Override
	public void receive(String message) {
		if(justAdded == true) {
			this.send("Succesfully added");
			justAdded = false;
		}
		
		if(message == "cat") {
			this.send("Dont use foul or abusive language");
		}
		
	}
	
}

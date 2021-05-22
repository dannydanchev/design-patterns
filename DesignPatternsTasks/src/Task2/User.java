package Task2;

public abstract class User {
	
	protected static ChatRoom mediator;
	protected String name;
	
	public User(ChatRoom mediator, String name) {
		this.mediator = mediator;
		this.name = name;
	}

	public abstract void send(String message);
	
	public abstract void receive(String message);
	
}

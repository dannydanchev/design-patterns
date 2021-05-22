package Task2;

import java.util.ArrayList;
import java.util.List;

public class Chat implements ChatRoom {
	
	private List<User> users;
	
	public Chat() {
		this.users = new ArrayList<>();
	}

	@Override
	public void sendMessage(String message, User user) {
		
		for(User chatUser: this.users) {
			if(chatUser != user) {
				chatUser.receive(message);
			}
		}
		
	}

	@Override
	public void addUser(User user) {
		this.users.add(user);
		
	}
}

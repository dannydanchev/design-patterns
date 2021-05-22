package Task2;

public class RoomMain {

	public static void main(String[] args) {
		
		ChatRoom chat = new Chat();
		
		User user1 = new ChatUser(chat, "Ivan");
		User user2 = new ChatUser(chat, "Maria");
		User user3 = new ChatUser(chat, "Petar");
		
		user1.send("Hello everyone!");
		user2.send("addBot");
		user3.send("cat");
		user3.send("Lmao");
		
	}

}

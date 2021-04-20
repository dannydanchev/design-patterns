package Task1;

public interface Weather {
	
	void subscribe(Subscriber subscriber);
	void unsubscribe(Subscriber subscriber);
	
	void notifySubscribers();
	String getUpdate();
}

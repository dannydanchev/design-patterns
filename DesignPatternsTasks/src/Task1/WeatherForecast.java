package Task1;

import java.util.ArrayList;
import java.util.List;

public class WeatherForecast implements Weather {

	private List<Subscriber> subscribers;
	private String forecast;
	
	public WeatherForecast() {
		this.subscribers = new ArrayList<>();
	}

	@Override
	public void subscribe(Subscriber subscriber) {
		this.subscribers.add(subscriber);
		subscriber.setForecast(this);

	}

	@Override
	public void unsubscribe(Subscriber subscriber) {
		this.subscribers.remove(subscriber);

	}

	@Override
	public void notifySubscribers() {
		for(Subscriber subscriber: this.subscribers) {
			subscriber.update();
		}

	}

	public void setForecast(String newForecast) {
		this.forecast = newForecast;
		this.notifySubscribers();
	}
	
	@Override
	public String getUpdate() {
		return this.forecast;
	}

}

package Task1;

public class ForecastSubscriber implements Subscriber {
	
	private String name;
	private Weather forecast;
	
	public ForecastSubscriber(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		
		if(this.forecast == null) {
			System.out.println(this.getName() + " has no forecast!");
		}
		
		String latestForecast = this.forecast.getUpdate();
		System.out.println(this.getName() + " received a new forecast: " + latestForecast);

	}

	@Override
	public void setForecast(Weather forecast) {
		this.forecast = forecast;

	}
	
	public String getName() {
		return name;
	}

}

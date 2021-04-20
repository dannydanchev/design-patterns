package Task1;

public class Main {

	public static void main(String[] args) {
		
		WeatherForecast forecast = new WeatherForecast();
		
		Subscriber sub1 = new ForecastSubscriber("Subscriber 01");
		Subscriber sub2 = new ForecastSubscriber("Subscriber 02");
		Subscriber sub3 = new ForecastSubscriber("Subscriber 03");
		
		forecast.subscribe(sub1);
		forecast.subscribe(sub2);
		forecast.subscribe(sub3);
		
		forecast.setForecast("Cloudy 12°C");
		
		forecast.setForecast("Sunny 20°C");

	}

}

package Tasks;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class WeatherApiClient {

	public static void main(String[] args) {
		try {
			BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the City Name :- ");
			
			String city = r.readLine();
			
			String apiKey = "c1fe8e3e2724cf4bf9756a5a26c6f828";
			
			String urlString = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey + "&units=metric";
			
			URL url = new URL(urlString);
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.setRequestMethod("GET");
			
			BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String inputLine;
			
			StringBuilder response = new StringBuilder();
			
			while((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			
			JSONObject json = new JSONObject(response.toString());
			String weather = json.getJSONArray("weather").getJSONObject(0).getString("main");
			
			double temp = json.getJSONObject("main").getDouble("temp");
			
			System.out.println("\nCity :- "+ city);
			System.out.println("Weather :- "+ weather);
			System.out.println("Tempreature :- "+ temp + "^C");
		}
		catch(Exception e) {
			System.out.println("Error :- " + e.getMessage());
			e.printStackTrace();
		}
	}

}

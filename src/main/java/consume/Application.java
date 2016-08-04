package consume;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner{


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
//		RestTemplate restTemplate = new RestTemplate();
//		WeatherData weatherData = restTemplate.getForObject("http://api.openweathermap.org/data/2.5/weather?id=4381982&APPID=2b7beb24cbcc81d128e7f51fa817a1f2", WeatherData.class);
//		System.out.println(weatherData.toString());
//		jdbcTemplate.update("Insert into weatherdata (name) VALUES ('megan')");


	}
}

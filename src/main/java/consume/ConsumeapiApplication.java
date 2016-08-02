package consume;

import consume.domain.WeatherData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class ConsumeapiApplication implements CommandLineRunner{

	private static final Logger log = LoggerFactory.getLogger(ConsumeapiApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ConsumeapiApplication.class, args);
	}

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void run(String... args) throws Exception{
		RestTemplate restTemplate = new RestTemplate();
		WeatherData weatherData = restTemplate.getForObject("http://api.openweathermap.org/data/2.5/weather?id=4381982&APPID=2b7beb24cbcc81d128e7f51fa817a1f2", WeatherData.class);
		log.info(weatherData.toString());
		System.out.println(weatherData.toString());

//		jdbcTemplate.query
	}
}

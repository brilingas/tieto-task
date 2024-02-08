package lt.brilingas.tieto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class TietoApplication {
	public static void main(String[] args) {
		SpringApplication.run(TietoApplication.class, args);
	}
}
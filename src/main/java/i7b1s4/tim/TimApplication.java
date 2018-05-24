package i7b1s4.tim;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class TimApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimApplication.class, args);
	}
}

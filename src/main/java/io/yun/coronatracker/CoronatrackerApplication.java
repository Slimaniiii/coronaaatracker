

package io.yun.coronatracker;

		import org.springframework.boot.SpringApplication;
		import org.springframework.boot.autoconfigure.SpringBootApplication;
		import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CoronatrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoronatrackerApplication.class, args);
	}
}
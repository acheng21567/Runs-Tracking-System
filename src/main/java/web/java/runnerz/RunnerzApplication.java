package web.java.runnerz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.core.Local;
import org.springframework.context.annotation.Bean;
import web.java.runnerz.run.JdbcRunRepository;
import web.java.runnerz.run.Location;
import web.java.runnerz.run.Run;
import web.java.runnerz.run.RunRepository;

import java.time.LocalDateTime;

@SpringBootApplication
public class RunnerzApplication {

	private static final Logger log = LoggerFactory.getLogger(RunnerzApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RunnerzApplication.class, args);
	}

//	@Bean
//	CommandLineRunner runner(JdbcRunRepository runRepository){
//		return args -> {
//			Run run = new Run(1, "First Run", LocalDateTime.now(), LocalDateTime.now(), 5, Location.OUTDOOR);
//			runRepository.create(run);
//		};
//	}

}

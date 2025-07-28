package topg.jenkinser;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinserApplication {

	private static final Logger logger = LoggerFactory.getLogger(JenkinserApplication.class);

	@PostConstruct
	public void init() {
		logger.info("Application started");
	}

	public static void main(String[] args) {
		SpringApplication.run(JenkinserApplication.class, args);
	}
}

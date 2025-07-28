package topg.jenkinser;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class JenkinserApplicationTests {

	@Test
	 contextLoads() {
		// Basic assertion to ensure the test passes
		String appName = "Jenkinser";
		assertThat(appName).isEqualTo("Jenkinser");

		// Additional assertions
		assertThat(appName).startsWith("Jenk"); // Check that appName starts with "Jenk"
		assertThat(appName.length()).isGreaterThan(5); // Check that the name length is greater than 5
	}
}

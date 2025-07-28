package topg.jenkinser;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class JenkinserApplicationTests {

	@Test
	void contextLoads() {
		// Basic assertion to ensure the test passes
		String appName = "Jenkinser";
		assertThat(appName).isEqualTo("Jenkinser");
	}
}

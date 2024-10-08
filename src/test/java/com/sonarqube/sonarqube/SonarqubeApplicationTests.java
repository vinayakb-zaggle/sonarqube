package com.sonarqube.sonarqube;

import com.sonarqube.sonarqube.service.File1;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SonarqubeApplicationTests {
	@InjectMocks
	File1 file1;

	@Test
	void contextLoads() {
		file1.newMethod();
	}

}

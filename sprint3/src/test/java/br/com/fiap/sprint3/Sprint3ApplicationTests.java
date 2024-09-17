package br.com.fiap.sprint3;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class Sprint3ApplicationTests {

	@Test
	void contextLoads() {
	}

}

package br.com.fiap.sprint3;

import org.springframework.boot.SpringApplication;

public class TestSprint3Application {

	public static void main(String[] args) {
		SpringApplication.from(Sprint3Application::main).with(TestcontainersConfiguration.class).run(args);
	}

}

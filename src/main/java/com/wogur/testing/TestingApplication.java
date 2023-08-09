package com.wogur.testing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestingApplication {
	private JwtCore jwtCore;

	public void setJwtCore(JwtCore jwtCore){
		this.jwtCore = jwtCore;
	}

	public static void main(String[] args) {
		SpringApplication.run(TestingApplication.class, args);
	}
}
package com.zaynsys.aopdemo;

import com.zaynsys.aopdemo.dao.IAccountDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AopdemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(AopdemoApplication.class, args);
	}


	@Bean
	public CommandLineRunner commandLineRunner(IAccountDAO accountDAO){
		return runner -> {

			demoTheBeforeAdvice(accountDAO);
		};
	}

	private void demoTheBeforeAdvice(IAccountDAO accountDAO) {
		// Call the business Method
		accountDAO.addAccount();
	}

}

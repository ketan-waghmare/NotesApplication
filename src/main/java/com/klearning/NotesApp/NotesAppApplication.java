package com.klearning.NotesApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.MongoTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

@SpringBootApplication
public class NotesAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotesAppApplication.class, args);
	}


	@Bean
	public PlatformTransactionManager add(MongoDatabaseFactory factory) {
		return new MongoTransactionManager(factory);
	}

}

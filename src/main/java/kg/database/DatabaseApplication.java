package kg.database;


import kg.database.entity.Author;
import kg.database.jdbc.AuthorJdbc;
import kg.database.jdbc.BookJdbc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DatabaseApplication implements CommandLineRunner {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	BookJdbc bookJdbc;
	AuthorJdbc authorJdbc;

	public static void main(String[] args) {
		SpringApplication.run(DatabaseApplication.class, args);}



		public void run(String... args) throws Exception {
			logger.info("All Users {}", bookJdbc.findAll());
			logger.info("User with id 1 -> {}", bookJdbc.findById(1));
			logger.info("Deleting user with id 2, # of deleted records = {}", bookJdbc.deleteById(2));

			logger.info("All Users {}", authorJdbc.findAll());
			logger.info("User with id 15 -> {}", authorJdbc.findById(15));
			logger.info("Deleting user with id 14, # of deleted records = {}", authorJdbc.deleteById(14));




	}



}

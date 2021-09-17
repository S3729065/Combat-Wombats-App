package combat.wombats.Wombat.Processors;

import combat.wombats.Wombat.Data.UserDbo;
import combat.wombats.Wombat.Models.User;
import combat.wombats.Wombat.WombatApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class DatabaseLoader {
	@Bean
	public CommandLineRunner initDatabase(UserDbo users) {
		return (args) -> {
			users.save(new User("JonnyDoenut"));
			users.save(new User("KateFromTechSupport"));
			users.save(new User("DanielS28"));
			users.save(new User("MetabanksBlue"));

			log.info("All Users");
			log.info("\n");
			for (User u : users.findAll()) {
				log.info(u.toString());
			}
			log.info("\n");
		};
	}

	private static final Logger log = LoggerFactory.getLogger(WombatApplication.class);
}
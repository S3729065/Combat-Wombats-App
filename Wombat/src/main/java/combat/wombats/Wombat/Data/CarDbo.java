package combat.wombats.Wombat.Data;

import combat.wombats.Wombat.Models.Account;
import combat.wombats.Wombat.Models.Car;
import combat.wombats.Wombat.Models.Company;
import combat.wombats.Wombat.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarDbo extends JpaRepository<Integer, Car> {
	List<Car> FindCarByAccount(Account account_);
	List<Car> FindCarByCompany(Company company_);
	List<Car> FindCarByUser(User user_);
}

package combat.wombats.Wombat.Data;

import combat.wombats.Wombat.Models.Car;
import combat.wombats.Wombat.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDbo extends JpaRepository<Integer, User> {
	List<User> FindUserByAccount(Account account_);
	List<User> FindUserByCar(Car car_);
	List<User> FindUserByCompany(Company company_);
}
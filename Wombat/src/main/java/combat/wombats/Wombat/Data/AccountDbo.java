package combat.wombats.Wombat.Data;

import combat.wombats.Wombat.Models.Account;
import combat.wombats.Wombat.Models.Company;
import combat.wombats.Wombat.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountDbo extends JpaRepository<Integer, Account> {
	List<Account> FindAccount_sCompanyName(Company company_);
	List<Account> FindAccount_sByUser(User user_);
}
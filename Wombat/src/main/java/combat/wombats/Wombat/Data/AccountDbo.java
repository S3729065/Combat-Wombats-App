package combat.wombats.Wombat.Data;

import combat.wombats.Wombat.Models.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountDbo extends JpaRepository<Integer, String> {}
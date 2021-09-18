package combat.wombats.Wombat.Data;

import combat.wombats.Wombat.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDbo extends JpaRepository<Integer, String> {}
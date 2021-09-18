package combat.wombats.Wombat.Data;

import combat.wombats.Wombat.Models.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyDbo extends JpaRepository<Integer, String> {}
package combat.wombats.Wombat.Data;

import combat.wombats.Wombat.Models.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarDbo extends JpaRepository<Car, Integer> {}

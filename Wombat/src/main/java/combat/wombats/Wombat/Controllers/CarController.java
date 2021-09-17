package combat.wombats.Wombat.Controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import combat.wombats.Wombat.Data.CarDbo;
import combat.wombats.Wombat.Models.Car;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/carservices")
public class CarController {
    CarController(CarDbo cars) {
        this._cars = cars;
    }

    @GetMapping("/carservices")
    public void GetCarServices(Model model) {
    	Map<String, Integer> hm = new HashMap<>();
		hm.put(CAR_SERVICES_DIR_URL, 0);
		model.mergeAttributes(hm);
	}

	public static String CAR_SERVICES_DIR_URL = "carservices.html";
    private final CarDbo _cars;
}

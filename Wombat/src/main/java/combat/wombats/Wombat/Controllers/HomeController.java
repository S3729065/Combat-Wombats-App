package combat.wombats.Wombat.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

@RestController
@RequestMapping("/index")
public class HomeController {
	@GetMapping("/")
	public void Index(Model model) {
		Map<String, Integer> hm = new HashMap<>();
		hm.put(INDEX_DIR_URL, 0);
		model.mergeAttributes(hm);
	}

	public static String INDEX_DIR_URL = "index.html";
}
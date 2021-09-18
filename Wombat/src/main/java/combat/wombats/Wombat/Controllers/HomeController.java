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
public class HomeController {
	@RequestMapping("/index")
	public String Index(Model model) {
		return INDEX_DIR_URL;
	}

	public static String INDEX_DIR_URL = "index";
}
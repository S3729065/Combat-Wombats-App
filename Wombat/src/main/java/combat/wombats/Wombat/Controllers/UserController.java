package combat.wombats.Wombat.Controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import combat.wombats.Wombat.Data.UserDbo;
import combat.wombats.Wombat.Models.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
	UserController(UserDbo users) {
		this._users = users;
	}

	@RequestMapping("/userprofile")
	public String GetUserProfile(Model model) {
		Map<String, Integer> hm = new HashMap<>();
		hm.put(USER_PROFILE_DIR_URL, 0);
		model.addAttribute("userprofile", Arrays.asList(
			(new User("JonnyDoenut");
			new User("KateFromTechSupport");
			new User("DanielS28");
			new User("MetabanksBlue");
		));
		model.mergeAttributes(hm);
		return USER_PROFILE_DIR_URL;
	}

	@PostMapping("/userprofile")
	Optional<User> FindUser(@PathVariable int id) {
		return _users.findById(id);
	}

	@PutMapping("/userprofile/{id}")
	Optional<User> UpdateUser(@PathVariable int id) {
		return _users.findById(id)
				.map(u -> {
					u.SetName(u.GetName());
					return _users.save(u);
				});
	}

	public static String USER_PROFILE_DIR_URL = "userprofile";
	private final UserDbo _users;
}
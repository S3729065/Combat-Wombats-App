package combat.wombats.Wombat.Controllers;

import java.util.List;
import java.util.Optional;

import combat.wombats.Wombat.Data.UserDbo;
import combat.wombats.Wombat.Models.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/userprofile")
public class UserController {
	UserController(UserDbo users) {
		this._users = users;
	}

	@GetMapping("/")
	public String GetUser() {
		return USER_DIR_URL;
	}

	@PostMapping("/user/{id}")
	Optional<User> FindUser(@PathVariable int id) {
		return _users.findById(id);
	}

	@PutMapping("/user/{id}")
	Optional<User> UpdateUser(@PathVariable int id) {
		return _users.findById(id)
				.map(u -> {
					u.SetName(u.GetName());
					return _users.save(u);
				});
	}

	public static String USER_DIR_URL = "userprofile.html";
	private final UserDbo _users;
}
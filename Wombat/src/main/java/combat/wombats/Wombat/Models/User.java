package combat.wombats.Wombat.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	public User() {}
	public User(String username) {
		this._username = username;
	}

	public int GetId() {
		return this._id;
	}

	public String GetName() {
		return this._username;
	}

	public void SetId(int id) {
		this._id = id;
	}

	public void SetName(String username) {
		this._username = username;
	}

	@Override
	public String toString() {
		return String.format(
		"User[id=%d, username='%s']", _id, _username);
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int _id;
	private String _username;
}
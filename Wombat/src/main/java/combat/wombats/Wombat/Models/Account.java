package combat.wombats.Wombat.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public Account {
	public Account() {}
	public Account(Company company, User user) {
		this._company = company;
		this._user = user;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int _accountNumber = 0L;
	private Company _company;
	private User _user;
}
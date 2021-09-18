package combat.wombats.Wombat.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public Company {
	public Company() {}
	public Company(String businessName) {
		this._businessName = businessName;
	}

	public int GetBusinessNumber() {
		return this._businessNumber;
	}

	public String GetBusinessName() {
		return this._businessName;
	}

	public void SetBusinessNumber(int businessNumber) {
		this._businessNumber = businessNumber;
	}

	public void SetBusinessName(String businessName) {
		this._businessName = businessName;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int _businessNumber = 0L;
	private String _businessName;
}
package combat.wombats.Wombat.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {
    public Car() {}
    public Car(int id, String model, String make) {
        this._id = id;
        this._model = model;
        this._make = make;
    }

    public int GetId() {
        return this._id;
    }

    public String GetModel() {
        return this._model;
    }

    public String GetMake() {
        return this._model;
    }

    public void SetId(int id) {
        this._id = id;
    }

    public void SetModel(String model) {
        this._model = model;
    }

    public void SetMake(String make) {
        this._make = make;
    }

	@Override
	public String toString() {
		return String.format(
		"User[id=%d, model='%s', make='%s']", _id, _model, _make);
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private int _id;
    private String _model;
    private String _make;
}

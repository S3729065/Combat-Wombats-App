package combat.wombats.Wombat.Process;

import combat.wombats.Wombat.Models.Account;
import combat.wombats.Wombat.Models.Car;
import combat.wombats.Wombat.Models.Company;
import combat.wombats.Wombat.Models.User;

import combat.wombats.Wombat.Process.Quotation;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;

public class ProductOrder {
	public ProductOrder(Account account) {
		_account = account;
	}

	public void Execute() {
		_quotation = new Quotation(_account);
	}

	public List<Quote> GetQuoteByCompanyAccount() {
		if (_quotation.IsQuoted() == true) {
			_quotation.GetQuoteByCompanyAccount(_input)
		} else if (_quotation.IsQuoted() == false) {
			_quotation = _quotation.Quote(_quotation);
		} else {
			return NULL;
		}
	}

	private AccountDbo _accountDbo;
	private Account _account;
	private Quotation _quotation;
}
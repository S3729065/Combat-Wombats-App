package combat.wombats.Wombat.Process;

import combat.wombats.Wombat.Models.Account;
import combat.wombats.Wombat.Models.Car;
import combat.wombats.Wombat.Models.Company;
import combat.wombats.Wombat.Models.User;

import combat.wombats.Wombat.Data.AccountDbo;
import combat.wombats.Wombat.Data.CarDbo;
import combat.wombats.Wombat.Data.CompanyDbo;
import combat.wombats.Wombat.Data.UserDbo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;

public class Quotation {
	public Quotation(Account account) {
		_account = account;
	}

	public Quotation Quote(Quotation quotation_) {
		return quotation_ = new Quotation(_account);
	}

	public List<Quote> GetQuoteByCompanyAccount(String input) {
		_company = new Company(input);
		List<AccountDbo> accountCompany = _companies.stream().filter(x -> x.FindAccount_sCompanyName(_company));
	}

	public boolean IsQuoted() {
		return _isQuoted;
	}

	public boolean _isQuoted;

	private AccountDbo _accountDbo;
	private Account _account;

	private CompanyDbo _companies;
	private Company _company;

	private UserDbo _users;
	private User _user;
}
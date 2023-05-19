package in.bank.Loans.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.bank.Loans.model.Loans;
import in.bank.Loans.repository.LoansRepository;
import in.bank.Loans.model.Customer;

@RestController
public class LoansController {

	@Autowired
	private LoansRepository loansRepository;
		
	@PostMapping("/loans")
	public List<Loans> getCardDetails(@RequestBody Customer customer) {		
		List<Loans> loans = loansRepository.findByCustomerId(customer.getCustomerId());
		return loans;
	}
}
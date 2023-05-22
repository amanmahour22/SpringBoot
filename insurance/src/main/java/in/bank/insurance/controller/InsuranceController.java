package in.bank.insurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import in.bank.insurance.model.Customer;
import in.bank.insurance.model.Insurance;
import in.bank.insurance.repository.InsuranceRepository;

@Controller
public class InsuranceController {

	@Autowired
	private InsuranceRepository insuranceRepository;
	
	@PostMapping("/insurance")
	public List<Insurance> getCardDetails(@RequestBody Customer customer) {		
		List<Insurance> loans = insuranceRepository.findByCustomerId(customer.getCustomerId());
		return loans;
	}
}

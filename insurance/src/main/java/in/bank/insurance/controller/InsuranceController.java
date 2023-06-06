package in.bank.insurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.bank.insurance.model.Customer;
import in.bank.insurance.model.Insurance;
import in.bank.insurance.repository.InsuranceRepository;

@RestController
public class InsuranceController {
	@Autowired
	private InsuranceRepository insuranceRepository;
	
	@PostMapping("/insurance")
	public List<Insurance> getCardDetails(@RequestBody Customer customer) {
		List<Insurance> insurance = insuranceRepository.findByCustomerId(customer.getCustomerId());
		return insurance;
	}
}

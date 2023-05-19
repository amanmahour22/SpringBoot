package in.bank.Loans.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.bank.Loans.model.Loans;

@Repository
public interface LoansRepository extends CrudRepository<Loans, Long>{
	List<Loans> findByCustomerId(int customerId);
}

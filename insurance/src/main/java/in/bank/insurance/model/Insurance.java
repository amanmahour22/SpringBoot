package in.bank.insurance.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "insurance")
public class Insurance {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "insurance_number")
	private int insuranceNumber; 
	
	@Column(name = "customer_id")
	private int customerId;

	@Column(name = "insurance_type")
	private String insuranceType;

	@Column(name = "insured_amount")
	private int insuredAmount;

	@Column(name = "insurance_end_date")
	private Date insuranceEndDate;

	public int getInsuranceNumber() {
		return insuranceNumber;
	}

	public void setInsuranceNumber(int insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getInsuranceType() {
		return insuranceType;
	}

	public void setInsuranceType(String insuranceType) {
		this.insuranceType = insuranceType;
	}

	public int getInsuredAmount() {
		return insuredAmount;
	}

	public void setInsuredAmount(int insuredAmount) {
		this.insuredAmount = insuredAmount;
	}

	public Date getInsuranceEndDate() {
		return insuranceEndDate;
	}

	public void setInsuranceEndDate(Date insuranceEndDate) {
		this.insuranceEndDate = insuranceEndDate;
	}

	@Override
	public String toString() {
		return "Insurance [insuranceNumber=" + insuranceNumber + ", customerId=" + customerId + ", insuranceType="
				+ insuranceType + ", insuredAmount=" + insuredAmount + ", insuranceEndDate=" + insuranceEndDate + "]";
	}

	
}

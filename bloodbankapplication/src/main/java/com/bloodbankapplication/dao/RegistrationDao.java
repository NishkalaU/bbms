package com.bloodbankapplication.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bloodbankapplication.model.BloodBankDetails;

public interface RegistrationDao extends JpaRepository<BloodBankDetails, Integer> {
	public abstract BloodBankDetails findByUserNameIn(String userName);

	// public abstract BloodBankDetails findByUserNameForRequestorIn(String
	// userName);
	@Query(value = "SELECT * FROM blood_bank_details bank WHERE bank.role = 'donor' and bank.status = 'accepted'", nativeQuery = true)
	List<BloodBankDetails> readByRole(String role);
	@Query(value = "SELECT * FROM blood_bank_details bank WHERE bank.status = 'Submitted'", nativeQuery = true)
	List<BloodBankDetails> readByStatus();
	@Modifying
	@Query(value = "UPDATE blood_bank_details bank SET bank.status='Accepted' WHERE bank.id = :id ", nativeQuery = true)
	void readById(@Param("id")Integer id);
	@Modifying
	@Query(value = "UPDATE blood_bank_details bank SET bank.status='Rejected' WHERE bank.id = :id ", nativeQuery = true)
	void updateById(@Param("id")Integer id);
	
}

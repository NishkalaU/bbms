package com.bloodbankapplication.service;

import com.bloodbankapplication.model.BloodBankDetails;

public interface RegistrationService {
	
	public abstract BloodBankDetails save(BloodBankDetails bloodBankDetails);
	public abstract BloodBankDetails findByUserNameIn(String userName);
	// public abstract BloodBankDetails findByUserNameForRequestorIn(String userName);
}

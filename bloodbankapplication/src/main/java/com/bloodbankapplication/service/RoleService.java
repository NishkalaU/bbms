package com.bloodbankapplication.service;

import java.util.List;

import com.bloodbankapplication.model.BloodBankDetails;

public interface RoleService {
	public abstract int roleFunction(String roleEntered);
	public abstract List<BloodBankDetails> donorDetailsForRequestorFunction();

}

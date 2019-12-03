package com.bloodbankapplication.service;

import java.util.List;

import com.bloodbankapplication.model.BloodBankDetails;

public interface AdminService {
	public abstract int adminValidation(String userName, String password);
	public abstract List<BloodBankDetails> updateStatus();
	public abstract void readById(int id);
	public abstract void updateById(int id);
}

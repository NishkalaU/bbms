package com.bloodbankapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bloodbankapplication.dao.RegistrationDao;
import com.bloodbankapplication.model.BloodBankDetails;

@Service
public class RoleServiceImpl implements RoleService {
	
	
	private String role = "donor";
	
	@Autowired
	private RegistrationDao registrationDao;

	@Override

	public int roleFunction(String roleEntered) {
		System.out.println("service" + roleEntered);
		if (role.equalsIgnoreCase(roleEntered)) {
			return 1;
		} else {
			return 0;
		}

	}

	@Override
	public List<BloodBankDetails> donorDetailsForRequestorFunction() {
		List<BloodBankDetails> listOfDonors = registrationDao.readByRole(role);
		return listOfDonors;
	}
}

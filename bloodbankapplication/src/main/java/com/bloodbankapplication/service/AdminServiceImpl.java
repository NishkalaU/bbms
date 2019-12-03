package com.bloodbankapplication.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bloodbankapplication.dao.RegistrationDao;
import com.bloodbankapplication.model.BloodBankDetails;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private RegistrationDao registrationDao;

	@Override
	@Transactional
	public int adminValidation(String userName, String password) {
		if(userName.equalsIgnoreCase("Admin") && password.equalsIgnoreCase("admin")){
			return 1;
		}
		else{
			return 0;
		}
	}

	@Override
	@Transactional
	public List<BloodBankDetails> updateStatus() {
		List<BloodBankDetails> list = registrationDao.readByStatus();
		return list;
	}

	@Override
	@Transactional
	public void readById(int id) {
		 registrationDao.readById(id);
		
	}

	@Override
	@Transactional
	public void updateById(int id) {
		registrationDao.updateById(id);
		
	}

}

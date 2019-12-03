package com.bloodbankapplication.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bloodbankapplication.dao.RegistrationDao;
import com.bloodbankapplication.model.BloodBankDetails;
@Service
public class RegistrationServiceImpl implements RegistrationService {
@Autowired
private RegistrationDao registrationDao;
private int s=0;
private BloodBankDetails blood = null;
	@Override
	public BloodBankDetails save(BloodBankDetails bloodBankDetails) {
		
		return registrationDao.save(bloodBankDetails);
	}
	@Override
	@Transactional
	public BloodBankDetails findByUserNameIn(String userName) {
		BloodBankDetails bloodBankDetails = registrationDao.findByUserNameIn(userName);
		try {
			if(bloodBankDetails.getUserName()!= null){
				System.out.println(bloodBankDetails.getRole());
			
			if(bloodBankDetails.getUserName().equalsIgnoreCase(userName)){
			s = 1;
			}
			else{
				s = 0;
			}
			
			}else{
				s = 0;
}
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("Invalid credentials");
		}if(s==1){
		return bloodBankDetails;
		}
		else{
			return blood;
		}
	}
	
	}
	


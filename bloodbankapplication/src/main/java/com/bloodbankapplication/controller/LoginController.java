package com.bloodbankapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bloodbankapplication.model.BloodBankDetails;
import com.bloodbankapplication.service.AdminService;
import com.bloodbankapplication.service.RegistrationService;
import com.bloodbankapplication.service.RoleService;

@Controller
public class LoginController {
	@Autowired
	private RegistrationService registrationService;
	@Autowired
	private RoleService roleService;
	@Autowired
	private AdminService adminService;

	@RequestMapping(value = "/register")
	public String registerFunction() {
		return "register";
	}

	@RequestMapping(value = "/role")
	public String signInFunction() {
		return "role";
	}

	@RequestMapping(value = "/registrationsubmit")
	public ModelAndView registrationSubmitFunction(@ModelAttribute BloodBankDetails bloodBankDetails) {
		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject("key", bloodBankDetails);

		registrationService.save(bloodBankDetails);

		System.out.println("User name: " + bloodBankDetails.getUserName());
		System.out.println("Password: " + bloodBankDetails.getPassword());
		return modelAndView;
	}

	@RequestMapping(value = "/roleSubmit")
	public String roleFunction(@RequestParam("role") String role, Model model) {
		System.out.println(role);
		BloodBankDetails bloodBankDetails = new BloodBankDetails();
		bloodBankDetails.setRole(role);
		System.out.println(bloodBankDetails.getRole());
		// int roleValidationResult =
		// roleService.roleFunction(bloodBankDetails.getRole());
		int roleValidationResult = roleService.roleFunction(role);
		System.out.println(roleValidationResult);
		if (roleValidationResult == 1) {
			return "login";

		} else {
			return "requesterLogin";
		}
	}

	@RequestMapping(value = "/signIn")
	public String donorSignInFunction(@RequestParam("userName") String user, @RequestParam("password") String pwd,
			Model model) {
		System.out.println("User name: " + user);
		System.out.println("Password: " + pwd);

		BloodBankDetails bloodBankDetails = new BloodBankDetails();

		bloodBankDetails.setUserName(user);
		bloodBankDetails.setPassword(pwd);

		BloodBankDetails blood = registrationService.findByUserNameIn(bloodBankDetails.getUserName());

		if (blood != null) {
			model.addAttribute("key", blood);
			return "loginStatus";
		} else {
			return "sorry";
		}
	}

	@RequestMapping(value = "/requestsignIn")
	public String requestorSignInFunction(@RequestParam("userName") String userName,
			@RequestParam("password") String password, Model model) {
		System.out.println("User name: " + userName);
		System.out.println("Password: " + password);

		BloodBankDetails bloodBankDetails = new BloodBankDetails();

		bloodBankDetails.setUserName(userName);
		bloodBankDetails.setPassword(password);

		BloodBankDetails blood = registrationService.findByUserNameIn(bloodBankDetails.getUserName());

		if (blood != null) {
			model.addAttribute("key", blood);
			return "requestorLoginStatus";
		} else {
			return "sorry";
		}
	}

	@RequestMapping(value = "/details")
	public ModelAndView donorDetailsForRequestorFunction() {
		ModelAndView modelAndView = new ModelAndView("donorDetailsForRequestor");
		List<BloodBankDetails> listOfDonors = roleService.donorDetailsForRequestorFunction();
		modelAndView.addObject("donorDetails", listOfDonors);
		return modelAndView;
	}

	@RequestMapping(value = "/admin")
	public String adminLoginFunction() {
		return "adminLogin";
	}

	@RequestMapping(value = "/adminLogin")
	public String adminHomeFunction(@RequestParam("userName") String userName,
			@RequestParam("password") String password) {
		int result = adminService.adminValidation(userName, password);
		if (result == 1) {
			return "adminHome";
		} else {
			return "sorry";
		}

	}

	@RequestMapping(value = "/UpdateStatus")
	public ModelAndView updateStatusFunction() {
		List<BloodBankDetails> list = adminService.updateStatus();
		ModelAndView modelAndView = new ModelAndView("donorRequestorDetailsForAdmin");
		modelAndView.addObject("details", list);
		return modelAndView;
	}
	
	@RequestMapping(value = "/accept")
	public String acceptRequestFunction(@RequestParam("id") int id) {
		System.out.println("hidden value" + id);
		adminService.readById(id);
		return "adminHome";
	}
	
	@RequestMapping(value = "/reject")
	public String rejectRequestFunction(@RequestParam("id") int id) {
		adminService.updateById(id);
		return "adminHome";
	}

}

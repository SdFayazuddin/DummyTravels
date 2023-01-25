package com.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserAccountDAO;
import com.dto.UserAccountDTO;
import com.entity.UserAccount;

@Service
public class UserService {
	
	@Autowired
	UserAccount userAccount;
	
	@Autowired
	UserAccountDAO userDAO;
	
	@Autowired
	UserAccountDTO userAccountDTO;
	
	public void storeUser(UserAccountDTO userDto) {
		BeanUtils.copyProperties(userDto, userAccount);
		userAccount.setFailedCount(0);
		userAccount.setStatus("Active");
		userDAO.save(userAccount);
	}
	
	public UserAccountDTO getUser(String email) {
		UserAccount user = userDAO.findById(email).get();
		BeanUtils.copyProperties(user, userAccountDTO);
		return userAccountDTO;
	}
	
	public void deleteUser(String email) {
		userDAO.deleteById(email);
	}
	
}

package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.UserAccount;

public interface UserAccountDAO extends JpaRepository<UserAccount, String>{

}

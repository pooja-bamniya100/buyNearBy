package com.bnb.service;

import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;

import com.bnb.model.Users;


public interface UserService {

	public long createUser(Users user);

}

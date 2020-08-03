package com.bnb.serivceImpl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bnb.model.Users;
import com.bnb.repository.UserRepository;
import com.bnb.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public long createUser(Users user) {
		Users tempUser;
	    Integer[] f=new Integer[5];
	    Date date =new Date();
		tempUser=userRepository.findByPhoneNumber(user.getPhoneNumber());
		if(tempUser==null) {
			user.setFavouriteShops(f);
			tempUser=userRepository.save(user);
		}
		return tempUser.getId();
	}

}

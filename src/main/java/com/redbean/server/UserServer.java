package com.redbean.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.redbean.dao.UserDao;
import com.redbean.model.User;
@Transactional
@Service
public class UserServer {
	
	@Autowired
	UserDao userDao;
	public boolean selectuser(String user_name,String password) {
		User newuser = userDao.getUser(user_name,password);
		System.out.println(newuser);
		if (newuser!=null) {
			return true;
		}
		return false;
	}
 
}

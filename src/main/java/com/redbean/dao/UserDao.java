package com.redbean.dao;

import com.redbean.model.User;

public interface UserDao {
	User getUser(String user_name,String password);
}

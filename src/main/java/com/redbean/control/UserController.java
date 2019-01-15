package com.redbean.control;


import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.redbean.server.UserServer;

@Controller
@RequestMapping("user")
public class UserController {

	@Autowired
	UserServer userServer;

	@RequestMapping(value="login",method=RequestMethod.POST)
	public String adminLogin(@Param("user_name") String user_name,
			@Param("password") String password){
		System.out.println("name is " +user_name);
		boolean selectuser = userServer.selectuser(user_name,password);
		if (selectuser) {
			return  "views/success";
		}
		return "views/login";

	}
}

package com.danai.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.danai.dao.CategoryDao;
import com.danai.dao.LocationDao;
import com.danai.dao.ProjectDao;
import com.danai.dao.UserDao;
import com.danai.model.User;

@Controller
public class UserController {
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private LocationDao locationDao;
	
	@Autowired
	private CategoryDao categoryDao;
	
	@Autowired
	private ProjectDao projectDao;
	
	@RequestMapping("/")
	public String setupForm(Map<String, Object> map)
	{
		User user = new User();
		map.put("user",user);
		map.put("userList",userDao.getAllUser());
		map.put("locationList", locationDao.getAllLocation());
		map.put("categoryList", categoryDao.getAllCategory());
		map.put("projectList", projectDao.getAllProject() );
		return "user";
		
	}
	
	@RequestMapping(value="/user.do", method=RequestMethod.POST)
	public String doActions(@ModelAttribute User user, BindingResult result, @RequestParam String action, Map<String, Object> map) {
		User userResult = new User();
		switch(action.toLowerCase()) {
		case "add":
			userDao.add(user);
			userResult = user;
			break;
		case "edit":
			userDao.edit(user);
			userResult = user;
			break;
		case "delete":
			userDao.delete(user.getUserId());
			userResult = user;
			break;
		case "search":
			User searchedUser =  userDao.getUser(user.getUserId());
			userResult = searchedUser!=null ? searchedUser : new User() ;
			break;
		}
		map.put("user",userResult);
		map.put("userList",userDao.getAllUser());
		return setupForm(map);
	}
	
	

}

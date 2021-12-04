package com.eya.demo.service;



import com.eya.demo.entities.Role;
import com.eya.demo.entities.User;

public interface UserService {
	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);
	
	
	
}

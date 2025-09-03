package net.javaguidges.springboot.service;

import java.util.List;

import net.javaguidges.springboot.entity.User;

public interface UserService {
	
	User createUser(User user);
	
	User  getUserById(Long userId);
	
	List<User> getAllUser();
	
	User updateUser(User user);
	
	void deleteUser(Long userId);
}

package net.javaguidges.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguidges.springboot.entity.User;
import net.javaguidges.springboot.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User createUser(User user) {
		return userRepository.save(user);
		
	}

	@Override
	public User getUserById(Long userId) {
		
		Optional<User> optionalUser=userRepository.findById(userId);
		return optionalUser.get();
	}


	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		
	   User existingUser=userRepository.findById(user.getId()).get();
	   existingUser.setFirstname(user.getFirstname());
	   existingUser.setLastname(user.getLastname());
	   existingUser.setEmail(user.getEmail());
	   User updatedUser=userRepository.save(existingUser);
		return updatedUser;
	}

	@Override
	public void deleteUser(Long userId) {
		// TODO Auto-generated method stub
		userRepository.deleteById(userId);
		
	}

}

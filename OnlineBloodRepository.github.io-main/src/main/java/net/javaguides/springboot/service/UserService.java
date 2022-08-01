package net.javaguides.springboot.service;

import net.javaguides.springboot.model.User;
import net.javaguides.springboot.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);

	List<User> filterDataWithPinCodeAndBloodGroup(String bloodGroup, String pinCode);

	List<User> rareblood();
}

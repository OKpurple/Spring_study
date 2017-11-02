package conf;
import chapter2.AuthFailLogger;
import chapter2.AuthenticationService;
import chapter2.User;
import chapter2.UserRepository;

import java.util.*;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config{
	@Bean
	public User user1() {
		return new User("jwh","1234");
	}
	
	@Bean
	public User user2() {
		return new User("jwh2","1234");
	}
	@Bean
	public UserRepository userRepository() {
		UserRepository userRepository = new UserRepository();
		userRepository.setUsers(Arrays.asList(user1(),user2()));
		return userRepository;
	}
	@Bean
	public AuthenticationService authService() {
		AuthenticationService auth = new AuthenticationService();
		auth.setFailLogger(authFailLogger());
		auth.setUserRepository(userRepository());
		return auth;
	}
	@Bean
	public AuthFailLogger authFailLogger() {
		AuthFailLogger logger = new AuthFailLogger();
		logger.setThreshold(2);
		return logger;
	}
}

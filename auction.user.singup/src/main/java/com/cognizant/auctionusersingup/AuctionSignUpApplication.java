package com.cognizant.auctionusersingup;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import com.cognizant.auctionusersingup.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.cognizant.auctionusersingup.entities.Authority;
import com.cognizant.auctionusersingup.entities.User;

@SpringBootApplication
public class AuctionSignUpApplication {
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private UserDetailsRepository userDetailsRepository;

	public static void main(String[] args) {
		SpringApplication.run(AuctionSignUpApplication.class, args);
	}
	
	@PostConstruct
	protected void init() {
		
		List<Authority> authorityList=new ArrayList<>();
		
		authorityList.add(createAuthority("BUYER"));

		User user=new User();
		user.setFullName("Admin");
		user.setUserName("admin");
		user.setPassword(passwordEncoder.encode("Admin786!"));
		user.setEmail("admin@admin.com");
		user.setEnabled(true);
		user.setAuthorities(authorityList);
		user.setRole("ADMIN");
		userDetailsRepository.save(user);
		authorityList=new ArrayList<>();
		authorityList.add(createAuthority("USER"));

		User user2=new User();
		user2.setFullName("Masum Islam");
		user2.setUserName("madsum");
		user2.setPassword(passwordEncoder.encode("Finbd786!"));
		user2.setEmail("madsum@gmail.com");
		user2.setEnabled(true);
		user2.setAuthorities(authorityList);
		user2.setRole("SELLER");
		userDetailsRepository.save(user2);
	}
	
	private Authority createAuthority(String roleCode) {
		Authority authority=new Authority();
		authority.setRoleCode(roleCode);
		return authority;
	}
	
	

}

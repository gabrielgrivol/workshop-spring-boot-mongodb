package com.bie.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bie.workshopmongo.domain.User;
import com.bie.workshopmongo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	public List<User> findAll(){
		return repo.findAll();
		
	}
}

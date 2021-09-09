package com.userservice.service;

import com.userservice.data.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserService {

	@Autowired
	private List<String> nameList;
	@Autowired
	private List<String> emailList;
	@Autowired
	private List<String> loginList;
	@Autowired
	private List<String> passwordList;


	public List<User> generate(int count){
		List<User> result = new ArrayList<>();

		for (int i = 0; i < count; i++) {
			result.add(generateUser(i));
		}
		return result;
	}

	private User generateUser(int id){
		User user = new User(); // todo add builder
		user.setId(id);
		user.setLogin(getRandomValue(loginList));
		user.setName(getRandomValue(nameList));
		user.setEmail(getRandomValue(emailList));
		user.setPassword(getRandomValue(passwordList));
		user.setCreationDate(new Date());
		return user;
	}

	private String getRandomValue(List<String> list){
		int index = new Random().nextInt(list.size() -1);
		return list.get(index);
	}

}

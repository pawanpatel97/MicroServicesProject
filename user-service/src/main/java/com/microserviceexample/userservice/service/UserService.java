package com.microserviceexample.userservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microserviceexample.userservice.entity.User;
import com.microserviceexample.userservice.repository.UserRepository;
import com.microserviceexample.valueobject.Department;
import com.microserviceexample.valueobject.ResponseTemplateVo;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	public User saveUser(User user) {
		log.info("Inside saveUser of  UserService");
		return userRepository.save(user);
	}

	public ResponseTemplateVo getUserWithDepartment(Long userId) {
		
		ResponseTemplateVo vo = new ResponseTemplateVo();
		
		User user = userRepository.findByUserId(userId);
		
		//Department department = restTemplate.getForObject(url:"http://localhost:9001/departments/" + user.getDepartmentId(), Department.class)
		Department department = restTemplate.getForObject("http://localhost:9001/departments/"+ user.getDepartmentId(), Department.class);
		vo.setUser(user);
		vo.setDepartment(department);
		
		return vo;
	}
	
}

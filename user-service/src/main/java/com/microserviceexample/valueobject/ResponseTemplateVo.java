package com.microserviceexample.valueobject;

import javax.annotation.security.DenyAll;

import com.microserviceexample.userservice.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVo {

	
	private User user;
	
	private Department department;
	
}

package com.microserviceexample.valueobject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {

	private Long departmentId;
	private String departmentName;
	private String depaertmentAddress;
	private String depaertmentCode;
	
}

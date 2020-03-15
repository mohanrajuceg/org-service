package com.iv.org.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.iv.org.biz.entity.EmployeeEntity;
import com.iv.org.biz.service.EmployeeService;

@RestController
@RequestMapping("/employeemasterservice")
public class EmployeeMasterServiceController {
	
	@Autowired
	EmployeeService employeeService; 
	
	@RequestMapping(value="/getEmpById", method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	public String getEmpById(@RequestParam String empId) throws JsonProcessingException {
		
		ObjectMapper mapper = new ObjectMapper();
		
		EmployeeEntity employeeEntity = employeeService.getEmpById(empId);
		return mapper.writeValueAsString(employeeEntity);
//		return JSONObject.valueToString(employeeEntity);
	}

}

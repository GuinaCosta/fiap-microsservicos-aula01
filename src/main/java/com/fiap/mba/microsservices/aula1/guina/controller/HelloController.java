package com.fiap.mba.microsservices.aula1.guina.controller;

import java.util.HashMap;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping(value="hello")
public class HelloController {

	@RequestMapping(value="/{firstName}/{lastName}", method = RequestMethod.GET)
	public String hello(@PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName) {
		HashMap<String, String> object = new HashMap<>();
		object.put("message", String.format("\"Hello %s %s \"", firstName, lastName));
		
		ObjectMapper mapper = new ObjectMapper().readValue(object, ObjectMapper.class);
		
		return mapper.toString();
	}
}

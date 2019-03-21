package com.fiap.mba.microsservices.aula1.guina.controller;

import java.util.HashMap;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping(value="hello")
public class HelloController {

	@RequestMapping(value="/{firstName}/{lastName}", method = RequestMethod.GET)
	public HashMap<String, String> hello(@PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName)
			throws JsonProcessingException {
		HashMap<String, String> object = new HashMap<>();
		object.put("message", String.format("Hello %s %s", firstName, lastName));

		return object;
	}
}

package com.example.restapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.restapi.models.Feedback;
import com.example.restapi.models.PostRequest;
//import com.example.restapi.models.PostResponse;
import com.example.restapi.repositories.FeedbackRepository;
//import com.example.restapi.repositories.PostResponseRepository;

@RestController
public class WebController {
	
	@Autowired
	FeedbackRepository repo;
	
//	@RequestMapping("/main")
//	public Feedback Sample(@RequestParam(value = "name", defaultValue = "Robot") String name) {
//		Feedback response = new Feedback();
//		response.setMessage("Your name is: " + name);
//		repo.save(response);
//		return response;
//	}
	
	@RequestMapping(value = "/feedback", method = RequestMethod.POST)
	public Feedback savePost(@RequestBody PostRequest inputPayload) {
		Feedback response = new Feedback();
		response.setMessage("Hello " + inputPayload.getName());
		response.setExtra(inputPayload.getExtra());
		repo.save(response);
		return response;
	}
}

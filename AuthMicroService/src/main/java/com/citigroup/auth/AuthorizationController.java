package com.citigroup.auth;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorizationController {

	AuthorizationService authorizationService = new AuthorizationService();
	@RequestMapping(value="/test", method = RequestMethod.GET)
	public String test(@RequestParam("id") String id, @RequestParam("pass") String pass){
		return authorizationService.ValidateUser(id,pass);
	}
	
	@RequestMapping(value = "/test2/{id}", method=RequestMethod.GET)
	@ResponseBody
	public String testmethodpost(@PathVariable("id") int id){
		return "Rest service call post method" + id;
	}
	
	@RequestMapping("*")
	@ResponseBody	
	String fallbackMethod(){
		return "fallback method";
	}
	
}

package com.citigroup.workflow.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.citigroup.workflow.service.WorkflowService;


@RestController
@RequestMapping("/workflow")
public class WorkflowController {
	

	private WorkflowService service;
	
	@Autowired
    public void setService(WorkflowService service) {
        this.service = service;
    }
	
	@RequestMapping(value = "/setWord", method = RequestMethod.POST)
	public String saveNewWord(@RequestParam Integer id, @RequestParam String word, @RequestParam String difLvl)
			throws Exception {
		return service.setWords(id, word, difLvl);
		
	}
	
	/*@RequestMapping(value = "/getWordsToReviewer", method = RequestMethod.POST)
	public Map getReviewerWords(@RequestParam String id)
			throws Exception {
	}*/
	
	

}

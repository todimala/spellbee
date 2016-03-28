package com.citigroup.workflow.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citigroup.workflow.Entity.WordDetails;
import com.citigroup.workflow.repository.WorkflowRepository;


public interface WorkflowService {
	
	Iterable<WordDetails> listAllProducts();
	
	WordDetails getWords(Integer userId);
	
	String setWords(Integer userId, String word, String difLvl);

}

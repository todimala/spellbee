package com.citigroup.workflow.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citigroup.workflow.Entity.WordDetails;
import com.citigroup.workflow.repository.WorkflowRepository;
@Service
public class WorkflowServiceImpl implements WorkflowService{

	private WorkflowRepository workflowRepository;
	
	
	
	public WorkflowRepository getWorkflowRepository() {
		return workflowRepository;
	}
	@Autowired
	public void setWorkflowRepository(WorkflowRepository workflowRepository) {
		this.workflowRepository = workflowRepository;
	}

	@Override
	public Iterable<WordDetails> listAllProducts() {
		
		return workflowRepository.findAll();
	}

	@Override
	public WordDetails getWords(Integer userId) {
		return workflowRepository.findOne(userId);
	}

	
	public String setWords(Integer userId, String word, String difLvl) {
		WordDetails newWord = new WordDetails();
		newWord.setId(userId.toString());
		newWord.setDifficultyLev(difLvl);
		newWord.setStatus("NEW");
		newWord.setWord(word);
		workflowRepository.save(newWord);
		return "success";
	}

}

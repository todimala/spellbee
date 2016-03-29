package com.citigroup.workflow.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citigroup.workflow.Entity.WordDetails;
import com.citigroup.workflow.repository.WorkflowRepository;
@Service
public class WorkflowServiceImpl implements WorkflowService{

	private WorkflowRepository workflowRepository;
	private static final String DIFF_LVL_1 = "Easy";
	private static final String DIFF_LVL_2 = "Intermediate";
	private static final String DIFF_LVL_3 = "Advanced";
	
	
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
		int dif = Integer.parseInt(difLvl);
		switch(dif){
			case 1:
				newWord.setDifficultyLev(DIFF_LVL_1);
			case 2:
				newWord.setDifficultyLev(DIFF_LVL_2);
			case 3:
				newWord.setDifficultyLev(DIFF_LVL_3);
		}
		newWord.setUserId(userId.toString());
		newWord.setStatus("NEW");
		newWord.setWord(word);
		Integer randomNum = 10 + (int)(Math.random() * 100000);
		newWord.setId(randomNum.toString());
		workflowRepository.save(newWord);
		return "success";
	}

}

package com.citigroup.workflow.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.citigroup.workflow.Entity.WordDetails;

public interface WorkflowRepository extends CrudRepository<WordDetails, Integer>{
	
}

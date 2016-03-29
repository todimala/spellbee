package com.citigroup.workflow.Entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "worddetails")
public class WordDetails {
	@Id
	@Column(name = "word_id")
	private String id;
	@Column(name = "word")
	private String word;
	@Column(name = "difficulty")
	private String difficultyLev;
	@Column(name = "status")
	private String status;
	@Column(name = "userid")
	private String userId;
	
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getDifficultyLev() {
		return difficultyLev;
	}
	public void setDifficultyLev(String difficultyLev) {
		this.difficultyLev = difficultyLev;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	

}

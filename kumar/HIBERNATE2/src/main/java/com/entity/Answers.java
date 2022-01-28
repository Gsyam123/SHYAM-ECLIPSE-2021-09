package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Answers {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String answername;
	private String postesdBy;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnswername() {
		return answername;
	}
	public void setAnswername(String answername) {
		this.answername = answername;
	}
	public String getPostesdBy() {
		return postesdBy;
	}
	public void setPostesdBy(String postesdBy) {
		this.postesdBy = postesdBy;
	}
	@Override
	public String toString() {
		return "Answers [id=" + id + ", answername=" + answername + ", postesdBy=" + postesdBy + "]";
	}
	
	
}

package com.snp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "questions")
public class QuestionEntity
{
	@Id
	private Integer qId;
	@Column(name = "myQ")
	private String myQ;
	@Column(name = "category")
	private String category;
	
	public Integer getQId()
	{
		return this.qId;
	}
	
	public void setQId(Integer qId)
	{
		this.qId = qId;
	}
	
	public String getMyQ()
	{
		return this.myQ;
	}
	
	public void setMyQ(String myQ)
	{
		this.myQ = myQ;
	}
	
	public String getCategory()
	{
		return this.category;
	}
	
	public void setCategory(String category)
	{
		this.category = category; 
	}
}
package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Engine {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	private int engineid;
    private int modelno;
    private String type;
    @OneToOne(targetEntity=Car.class)
    private Car c;
	public int getEngineid() {
		return engineid;
	}
	public void setEngineid(int engineid) {
		this.engineid = engineid;
	}
	public int getModelno() {
		return modelno;
	}
	public void setModelno(int modelno) {
		this.modelno = modelno;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Car getC() {
		return c;
	}
	public void setC(Car c) {
		this.c = c;
	}
	@Override
	public String toString() {
		return "Engine [engineid=" + engineid + ", modelno=" + modelno + ", type=" + type + ", c=" + c + "]";
	}
    
	
}

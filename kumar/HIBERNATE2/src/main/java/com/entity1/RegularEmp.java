package com.entity1;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="ID")  

public class RegularEmp extends Emp {
	private int salary;
	private int bonus;
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	@Override
	public String toString() {
		return "RegularEmp [salary=" + salary + ", bonus=" + bonus + "]";
	}
	
}

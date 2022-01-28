package com.entity1;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "ID")

public class ContractEmp extends Emp {
	private int payperhour;
	private int contractduration;

	public int getPayperhour() {
		return payperhour;
	}

	public void setPayperhour(int payperhour) {
		this.payperhour = payperhour;
	}

	public int getContractduration() {
		return contractduration;
	}

	public void setContractduration(int contractduration) {
		this.contractduration = contractduration;
	}

	@Override
	public String toString() {
		return "ContractEmp [payperhour=" + payperhour + ", contractduration=" + contractduration + "]";
	}

}

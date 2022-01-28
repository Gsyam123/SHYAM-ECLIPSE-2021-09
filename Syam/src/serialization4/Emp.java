package serialization4;

import java.io.Serializable;

public class Emp implements Serializable {
	public int id;
	public String name;
	public transient Address add;

	Emp(int id, String name, Address add) {
		this.id = id;
		this.name = name;
		this.add = add;

	}

}
package externalization;

import java.io.*;

class Emp implements Externalizable {
	int id;
	String name;

	Emp(int id, String name) {
		this.id = id;
		this.name = name;

	}

	public void writeExternal(ObjectOutput oo) throws IoException {
		oo.writeInt(id);
		oo.writeObject(name);

	}

	public void readExternal(ObjectInput oi) throws IoException, ClassNotFoundException {
		id = oi.readInt();
		name = oi.readObject().toString();

	}
}

class HR extends Emp {
	int count;

	HR(int id, String name, int count) {
		super(id, name);
		this.count = count;

	}

	public void writeExternal(ObjectOutput oo) throws IoException {
		oo.writeInt(count);
	}

	public void readExternal(ObjectInput oi) throws IoException, ClassNotFoundException {
		count = oi.readInput();
	}
	}

public class Test1 {

}

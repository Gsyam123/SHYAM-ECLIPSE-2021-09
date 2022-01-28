package iocclassfiles;

public class Car {
private int cc;
private String name;
public int getCc() {
	return cc;
}
public void setCc(int cc) {
	this.cc = cc;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Car [cc=" + cc + ", name=" + name + "]";
}

}

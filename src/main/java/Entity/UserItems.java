package Entity;

public class UserItems {
private String Name;
private int quentity;


public UserItems() {
	super();
	// TODO Auto-generated constructor stub
}
public UserItems(String name, int quentity) {
	super();
	Name = name;
	this.quentity = quentity;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public int getQuentity() {
	return quentity;
}
public void setQuentity(int quentity) {
	this.quentity = quentity;
}

}

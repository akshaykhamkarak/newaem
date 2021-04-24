package Entity;

public class AvailableItem {
private String itemName;
private int quentity;
private int price;



public AvailableItem() {
	super();
	// TODO Auto-generated constructor stub
}
public AvailableItem(String itemName, int quentity, int price) {
	super();
	this.itemName = itemName;
	this.quentity = quentity;
	this.price = price;
}
public String getItemName() {
	return itemName;
}
public void setItemName(String itemName) {
	this.itemName = itemName;
}
public int getQuentity() {
	return quentity;
}
public void setQuentity(int quentity) {
	this.quentity = quentity;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}

}

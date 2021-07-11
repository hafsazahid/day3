package p3;

public class Electronics {
	int power;
	int memory;
	int deviceNumber;
	String brandname;
   private int price; private int rating;
public Electronics() {
	// TODO Auto-generated constructor stub
}
public Electronics(int power, int memory,int deviceNumber,String brandname,int price,int rating)
{
	super();
	this.power= power;
	this.memory=memory;
	this.deviceNumber=deviceNumber;
	this.brandname=brandname;
	this.price=price;
	this.rating=rating;
	
}

public int getPower() {
	return power;
}
public void setPower(int power) {
	this.power = power;
}
public int getMemory() {
	return memory;
}
public void setMemory(int memory) {
	this.memory = memory;
}
public int getDeviceNumber() {
	return deviceNumber;
}
public void setDeviceNumber(int deviceNumber) {
	this.deviceNumber = deviceNumber;
}

public String getBrandname() {
	return brandname;
}
public void setBrandname(String brandname) {
	this.brandname = brandname;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getRating() {
	return rating;
}
public void setRating(int rating) {
	this.rating = rating;
}
public void PowerInput()
{
	power= power*10;
	System.out.println("Power -" +power);
}
public void DeviceNumber()
{
	System.out.println("The Device number is" + getDeviceNumber());
}
}

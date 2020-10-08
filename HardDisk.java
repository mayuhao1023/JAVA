package test_one;

public class HardDisk {
private int amount;
private int readSpeed;
public HardDisk(){
	
}
public HardDisk(int amount,int readSpeed) {
	setAmount(amount);
	setReadSpeed(readSpeed);
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {

    this.amount = amount;

 }
public int getReadSpeed() {
	return readSpeed;
}
public void setReadSpeed(int readSpeed) {

    this.readSpeed = readSpeed;

 }
}

package test_one;

public class CPU {
private int speed;
private String type;
private double hertz;
public CPU(){

}
public CPU(int speed,String type,double hertz) {
	setSpeed(speed);
	setType(type);
	setHertz(hertz);
}
public int getSpeed() {
	return speed;
}
public String getType() {
	return type;
}
public double getHertz() {
	return hertz;
}
public void setSpeed(int m) {
	if(m>1000 && m<3000)
	speed=m;
    else 
    	{System.out.println("CPU speed was wrong!");
    	speed=m;
    	}
}
public void setType(String m) {
	type=m;
}
public void setHertz(double m) {
	hertz=m;
}
}

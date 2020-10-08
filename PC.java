package test_two;

import test_one.CPU;
import test_one.HardDisk;

public class PC {
private HardDisk HD;
private CPU cpu;
public PC(){
	
}
public PC(CPU cpu,HardDisk HD) {
	setCPU(cpu);
	setHardDisk(HD);
}

public void setCPU(CPU c) {
	cpu=c;
}
void setHardDisk(HardDisk h) {
	HD=h;
}
void show() {
	System.out.println("CPU type is "+cpu.getType()+".");
	System.out.println("CPU speed is "+cpu.getSpeed()+" MB/s.");
	System.out.println("CPU hertz is "+cpu.getHertz()+" GHZ.");
	System.out.println("HardDisk is "+HD.getAmount()+" G.");
	System.out.println("HardDisk readspeed is "+HD.getReadSpeed()+" MB/s.");
}
}

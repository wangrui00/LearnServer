package com.java.rxjava;

interface Machine{
	void run();
}

class Person5{
	public void run(){
		System.out.println("person run!");
	}
}

class Robot extends Person5{
	private class MachineHeart implements Machine{
		public void run(){
			System.out.println("machine run!");
		}
	}
	public Machine getMachine(){
		return new MachineHeart();
	}
}


public class RobotTest {
	public static void main(String[] args){
		Robot r=new Robot();
		Machine m=r.getMachine();
		m.run();
		r.run();
	}
}

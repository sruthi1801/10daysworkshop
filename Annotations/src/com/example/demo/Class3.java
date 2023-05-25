package com.example.demo;
class Temp{
	public void set() {
	 System.out.print("cat");	
	}
}
class Temp2 extends Temp{
	@Override
	public void set() {
	 System.out.print("Rat");	
	}
}
public class Class3 extends Temp{

public static void main(String args[])
{
	Temp c=new Temp2();
	c.set();
}
}

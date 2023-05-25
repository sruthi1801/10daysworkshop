package com.example.demo;
@FunctionalInterface
interface tree{
	void set();
}
public class Class2 {
 public static void main(String args[])
 {
	 tree t=()->{
		System.out.print("hi");
	 };
	 t.set();
 }
}

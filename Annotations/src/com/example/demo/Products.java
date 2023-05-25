package com.example.demo;
import java.util.*;
@Trial
public class Products {
private int id;
private String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public static void main(String args[]) throws Exception
{
	Products p=new Products();
	Class c=p.getClass();
	Trial t=(Trial) c.getAnnotation(Trial.class);
	System.out.print(t.value1()+"-----"+t.value2());
	
}
}

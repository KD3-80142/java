package com.app.fruits;

public class Mango extends Fruits {
    
	public Mango(String name,String color,double weight) {
		this.name=name;
		this.color=name;
		this.weight=weight;
	}
	
	@Override
	public String taste() {
		
		return "sour";
	}
	@Override
	public void AccepetData() {
		// TODO Auto-generated method stub
		super.AccepetData();
	}
	@Override
	public void disply() {
		// TODO Auto-generated method stub
		super.disply();
	}
}

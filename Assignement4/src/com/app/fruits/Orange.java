package com.app.fruits;

public class Orange extends Fruits {
	public Orange() {
		// TODO Auto-generated constructor stub
	}

	public Orange(String name,String color,double weight) {
		this.name=name;
		this.color=color;
		this.weight=weight;
	}
	
    @Override
    public String taste() {
    	// TODO Auto-generated method stub
    	return "sweet";
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

package com.app.fruits;

class apple extends Fruits {
	
	@Override
		public String taste() {
			// TODO Auto-generated method stub
			return "Sweet & sour";
		}
	public apple() {
		// TODO Auto-generated constructor stub
	}
	
public apple(String name, String color,double weight) {
	 this.name=name;
	 this.color=color;
	 this.weight=weight;
}
    @Override
    public void AccepetData() {
    	
    	super.AccepetData();
    }
    
    @Override
    public void disply() {
    	// TODO Auto-generated method stub
    	super.disply();
    }
 
}

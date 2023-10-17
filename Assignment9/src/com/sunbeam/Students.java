package com.sunbeam;


	 public class Students implements Comparable <Students>{
		private int rollNO;
		private String name;
		private String city;;
		private int marks;
		public Students() {
			// TODO Auto-generated constructor stub
		}
		public Students(int rollNO, String name, String city, int marks) {
		
			this.rollNO = rollNO;
			this.name = name;
			this.city = city;
			this.marks = marks;
		}
		public int getRollNO() {
			return rollNO;
		}
		public void setRollNO(int rollNO) {
			this.rollNO = rollNO;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public int getMarks() {
			return marks;
		}
		public void setMarks(int marks) {
			this.marks = marks;
		}
		@Override
		public String toString() {
			return "student [rollNO=" + rollNO + ", name=" + name + ", age=" + city + ", marks=" + marks + "]";
		}
		@Override
		public int compareTo(Students other) {
			int diff = - this.city.compareTo(other.city);//same name 
			if(diff==0)
			
			diff = -(this.marks - other.marks);//Ascending order
			if(diff==0)
			 diff= this.name.compareTo(other.name);
			return diff;
		}
		
		
		
	}



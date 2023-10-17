package com.sunbeam;

public class ExceptionLineTooLong extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int noOfCharacter ;
	String stringName ;
	
	
	
	


	public ExceptionLineTooLong(int noOfCharacter, String stringName) {
		
		this.noOfCharacter = noOfCharacter;
		this.stringName = stringName;
	}
	
	public void IsEqual()
	{
		if(this.stringName.length()>80)
		{
			throw new ExceptionLineTooLong(noOfCharacter, stringName);
		}
		else
			System.out.println("The stream is "+ stringName);
	}






	@Override
	public String toString() {
		return "ExceptionLineTooLong [noOfCharacter=" + noOfCharacter + ", stringName=" + stringName + "]";
	}
	
	
	
	

}
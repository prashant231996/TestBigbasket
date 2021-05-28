package com.htc.bigbasket.exceptions;

public class MyException extends Exception{

	
   private String errorMessage;
	
	/*public NullElementException()
	{
		this.errorMessage="Element is not found at specified location";
		System.out.println(errorMessage);
		
	}*/
	
   
   	public MyException(String errorMessage) {
			super(errorMessage);
			
		}
   	
		public String toString()
		{
			return errorMessage;
		}

}

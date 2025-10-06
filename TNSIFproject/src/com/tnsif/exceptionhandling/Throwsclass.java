package com.tnsif.exceptionhandling;

public class Throwsclass {
	public void show() throws Exception
	{
		String s = null;
		throw new NullPointerException("Nulls Not Allowed");
	}

}

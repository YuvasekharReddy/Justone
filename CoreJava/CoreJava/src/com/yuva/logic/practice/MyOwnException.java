package com.yuva.logic.practice;

public class MyOwnException {
    public static void main(String[] args){
    	
        try{
        	// int a=10/0;//based on this exception we are not handle so inside console shows Exception Abnormal termination
            MyOwnException.myTest(null);//like this present write code for using try and catch
           
        } catch(MyAppException mae){
            System.out.println("Inside catch block: "+mae.getMessage());
        }
    }
    
    static void myTest(String str) throws MyAppException{
        if(str == null){                                  //like this method already to write every method in JDBC inside i.e getConnetion(),createStatement(),execute()-----
            throw new MyAppException("String val is null");
        }
    }
}

class MyAppException extends Exception {//here own exception is Checked Exception

	private String message = null;

	public MyAppException() {
		super();
	}

	public MyAppException(String message) {
		super(message);
		this.message = message;
	}

	public MyAppException(Throwable cause) {
		super(cause);
	}

	@Override
	public String toString() {
		return message;
	}

	@Override
	public String getMessage() {
		return message;
	}
}
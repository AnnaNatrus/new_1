package com.test;

public class MyException extends Exception {
    public String toString() {
        return "Such triangle does not exist.";
    }

//	public MyException (String message) {
//	       super(message);
//	   }
}

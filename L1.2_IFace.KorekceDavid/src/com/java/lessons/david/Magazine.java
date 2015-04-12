package com.java.lessons.david;

public class Magazine implements IfaceReadable {

	@Override   // << tohle mi tam naskocilo samo!
	public void readText() {
		System.out.println("Inner print : " + this.getClass().getName());
	}

}

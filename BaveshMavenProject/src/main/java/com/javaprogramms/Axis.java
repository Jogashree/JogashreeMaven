package com.javaprogramms;

class RBI{
	int roi;
	int ifsccode;
}
class SBI extends RBI{
	void gettingrateofinterest() {
		roi=500;
		ifsccode=456;
		System.out.println(roi);
		System.out.println(ifsccode);
	}
	
}

public class Axis extends RBI{

	public static void main(String[] args) {
		
		SBI s=new SBI();
		s.gettingrateofinterest();
	

	}

}

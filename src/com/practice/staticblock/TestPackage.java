package com.practice.staticblock;

class TestPackage {

	public TestPackage() {
		// TODO Auto-generated constructor stub
	}
	
	public class foo {
		static final int a = 10;
		private static final int b = 20;
		
	}
	
	public class bar {
		static final int x = 100;
		private static final int y = 200;
	}
	
	public static void main(String[] args){
		System.out.println("a: " + foo.a);
		System.out.println("b: " + foo.b);
		System.out.println("x: " + bar.x);
		System.out.println("y: " + bar.y);
		
	}
}

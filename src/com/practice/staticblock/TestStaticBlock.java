package com.practice.staticblock;

public class TestStaticBlock {
	private static final int a;
	//static block
	static {
		System.out.println("Call static block");
		a = 100;
	}
	//initializer block
	{
		System.out.println("Call common part");
	}
	
	public TestStaticBlock() {
		System.out.println("Call constructor with no parameter");
		// TODO Auto-generated constructor stub
	}
	
	public TestStaticBlock( int a ) {
		System.out.println("Call constructor with parameter");
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("a: " + TestStaticBlock.a);
		new TestStaticBlock();
		new TestStaticBlock(100);
	}
}
package com.r177219068.q1;

public class Derived extends Super {
	public static void main(String[] args) {
		Super obj = new Super ();
		System.out.println("Value of non-private field is "+obj.a) ;
		//System.out.println("Value of private field is "+obj.b);
		
		System.out.println(Super.publicMethod( ));
		//System.out.println(Super.privateMethod( ));

}
}

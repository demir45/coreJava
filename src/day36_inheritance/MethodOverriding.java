package day36_inheritance;

public class MethodOverriding {

	public static void main(String[] args) {
		
		X x = new X();
		Y y = new Y();
		y.m2();
		x.m1();
		y.m1();
		x=y;
		x.m1();

	}

}

class X{
	
	public void m1() {
		System.out.println("m1 - x");
	}
	
}

class Y extends X{

	@Override
	public void m1() {
		System.out.println("m1 - y");
	}
	
	public void m2() {
		System.out.println("m2 - y");
	}
}

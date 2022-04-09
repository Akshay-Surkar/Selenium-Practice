package inheritance;

public class Child1 extends Parent { // we are creating relation using extends keyword

	int a = 25;
	static int b = 35;

	public void m3() {
		System.out.println(a);// class level call
		System.out.println(b);// class level Inside non static: static and non static variable call
		System.out.println(super.a);// parent class
		System.out.println(super.b);// parent class
	}

	public static void m5() {
		Parent c = new Parent();// create a object of parent to call parent non static variable
		System.out.println(c.a);// Inside static: static and non static variable call
		System.out.println(Parent.b);

	}

	public static void main(String[] args) {
		Child1 cc = new Child1();// calling parent class method on the basis of child class object by
									// creating child object

		cc.m1();

		m2();// parent class static method by direct method name

		m5();
		cc.m3();

		System.out.println(cc.a);// class level non static variable
	}

}

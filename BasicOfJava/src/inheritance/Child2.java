package inheritance;

//MULTIPLE INHERITANCE
public class Child2 extends Child1 {// multiple child of single parent class

	int s = 18;
	static int h = 23;

	public static void m6() {
		int h = 24;
		System.out.println(h);// local static variable
		System.out.println(Child2.h);// class level static variable
		System.out.println(Parent.b);
		System.out.println(b);
	}

	public void m7() {
		int s = 28;
		System.out.println(s);// local variable
		System.out.println(this.s);// class level non static variable
	}

	public static void main(String[] args) {

		Child2 n = new Child2();
		m6();
		n.m1();
		n.m3();
		m2();
		m5();
		System.out.println(n.a);
	}

}

package constructor;

public class Test3 extends Constructors {

	public void m5() {
		System.out.println("test3 m5 method");
	}

	public void m6() {
		System.out.println("test3 m6 method");
	}

	public void m7() {
		// t1.m1();
		t1.m2();
		t2.m3();
		// t2.m4();

	}

	public static void main(String[] args) {
		Test3 t = new Test3();

		t.m7();
		t.m6();
	}
}

package constructor;

public class Test2 extends Test1 {

	public void m3() {
		System.out.println("test2 m3 method");
	}

	public void m4() {
		System.out.println("test2 m4 method");
	}

	Test2() {
		System.out.println("test2 constructor");
	}

	public static void main(String[] args) {
		Test2 n = new Test2();

	}

}

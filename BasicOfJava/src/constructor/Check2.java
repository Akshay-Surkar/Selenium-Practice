package constructor;

public class Check2 extends check {
	public static void m1() {
		System.out.println("child m1 method");
		
	}
	public static void main(String[] args) {
		check ck2 = new Check2();
		ck2.m1();
		check.m1();
		m1();
		
	}

	}


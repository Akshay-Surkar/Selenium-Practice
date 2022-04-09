package constructor;

public class Const2 {

	String name;
	int roll;
	double mark;
	static String school;

	public Const2(String n, int r, double m) {

		name = n;
		roll = r;
		mark = m;

	}

	public static void main(String[] args) {
		Const2 t = new Const2("raju", 21, 35);
		Const2 t1 = new Const2("shyam", 25, 70);
		Const2 t2 = new Const2("babu", 23, 1);

		System.out.println(t1.name + t1.mark + t1.roll);

	}
}

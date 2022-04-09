package nonstatic;

public class Test {

	String name;
	int marks;
	double percentage;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test std1 = new Test();

		std1.marks = 25;
		std1.percentage = 24.5;
		System.out.println("1 Student1 Marks:" + std1.marks + " & Percentage:" + std1.percentage);

		Test std2 = new Test();

		std2.marks = 30;
		std2.percentage = 27;

		System.out.println("2 Student2 Marks:" + std2.marks + " & Percentage:" + std2.percentage);

		Test std3 = new Test();

		std3.marks = 40;
		std3.percentage = 35.8;
		System.out.println("3 Student1 Marks:" + std3.marks + " & Percentage:" + std3.percentage);

		Test std4 = new Test();

		std4.marks = 58;
		std4.percentage = 55.5;
		std4.name = "Saurabh Pagar";
		System.out.println("4 Student1 Marks:" + std4.marks + " & Percentage:" + std4.percentage);

		Test std5 = new Test();

		std5.marks = 80;
		std5.percentage = 68.5;
		System.out.println("5 Student1 Marks:" + std5.marks + " & Percentage:" + std5.percentage);

		System.out.println(std4.marks);
		System.out.println(std4.name);
	}

}

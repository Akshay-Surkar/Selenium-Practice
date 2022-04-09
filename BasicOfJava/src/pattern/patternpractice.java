package pattern;

public class patternpractice {

	public static void main(String[] args) {
		System.out.println("-------1---------");
		// *
		// **
		// ***
		// ****
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}

		System.out.println("-------2---------");
		// ****
		// ***
		// **
		// *
		for (int i = 1; i <= 4; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------3---------");
		//    *
		//   **
		//  ***
		// ****

		for (int i = 1; i <= 4; i++) {
			for (int j = 3; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------4---------");
		// ****
		//  ***
		//   **
		//    *
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 4; k >= i; k--)
				System.out.print("*");
			System.out.println();
		}
		System.out.println("-------5---------");
		// 1
		// 22
		// 333
		// 4444
		// 55555
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("-------6---------");
		//      1
		//     22
		//    333
		//   4444
		//  55555
		for (int i = 1; i <= 5; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");

			}
			for (int k = 1; k <= 1; k++) {
				for (int m = 1; m <= i; m++) {
					System.out.print(i);
				}
			}
			System.out.println();
			
		}
		System.out.println("-------7---------");
	//	     * 
	//	    * * 
	//	   * * * 
	//	  * * * * 
	//	 * * * * * 
		for(int i =1;i<=5;i++) {
		for(int j=5;j>=i;j--) {
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++) {
			System.out.print(" *");
		}
			System.out.println();
		}
		System.out.println("-------8---------");
		//     1 
		 //   2 2 
		 //  3 3 3 
		//  4 4 4 4 
	   //  5 5 5 5 5 

			for(int i =1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(i+" ");
			}
				System.out.println();
			}
	}}
	
	
		


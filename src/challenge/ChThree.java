package challenge;

import java.util.Scanner;

/**
 * @author thein
 * @createdAt Apr 2, 2019
 */
public class ChThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		double db = sc.nextDouble();
		sc.nextLine();
		String str = sc.nextLine();
		
		 System.out.println("String: " + str);
		 System.out.println("Double: " + db);
		 System.out.println("Int: " + num);

		sc.close();

	}
}

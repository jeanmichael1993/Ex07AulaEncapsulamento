
import java.util.Locale;
import java.util.Scanner;

import exAula.Circle;

public class Main {

	public static void main(String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Circle c1 = new Circle(3.0);
		Circle c2 = new Circle(4.0);
		Circle c3 = new Circle(7.0);

		System.out.println("c1: \n" + c1);
		System.out.println("c2: \n" + c2);
		System.out.println("c3: \n" + c3);
		
		
		sc.close();
		
	}
}

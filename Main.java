
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exAula.Circle;

public class Program {

	public static void main(String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Circle> circle = new ArrayList<>();
		
		for(int i=0;i<3;i++) {
			System.out.printf("Circle %d%n",i+1);
			double valor = sc.nextDouble();
			circle.add(new Circle(valor));
		}
		
		for(Circle x: circle) {
			System.out.println("\n" + x);
		}
			
		sc.close();
		
	}
}

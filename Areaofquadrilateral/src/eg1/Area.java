package eg1;

import java.util.Scanner;

public class Area {
	
	static double areaofQuad(double l, double b) {
		return l*b;
	}
	static double areaofQuad(double s) {
		return s*s;
	}
	static double areaofQuad(double a, double b,double h) {
		return h/2 *(a+b);
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s =sc.nextLine();
		if (s.equalsIgnoreCase("R"))
		{
			System.out.println("length of rectangle");
			double l =sc.nextDouble();
			System.out.println("breath of rectangle");
			double b =sc.nextDouble();
			System.out.println("area of rectangle" + areaofQuad(l,b));
		}
		if (s.equalsIgnoreCase("S"))
		{
			System.out.println("side of square");
			double l =sc.nextDouble();
			System.out.println("area of square" + areaofQuad(l));
		}
		if (s.equalsIgnoreCase("T"))
		{
			System.out.println("length of parallel side");
			double l =sc.nextDouble();
			System.out.println("length of parallel side");
			double b =sc.nextDouble();
			System.out.println("height of trapezium");
			double h =sc.nextDouble();
			System.out.println("area of trapezium" + areaofQuad(l,b,h));
		}
		sc.close();
		

	}

}

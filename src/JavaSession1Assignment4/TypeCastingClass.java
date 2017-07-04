package JavaSession1Assignment4;

import java.util.Scanner;

public class TypeCastingClass {

	public static void main(String[] args) {
		byte b;
		short s;
		int i;
		long l;
		float f;
		double d;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value for byte variable");
		b = input.nextByte();
		System.out.println("Enter the value for short variable");
		s = input.nextShort();
		
		i = b + s;
		System.out.println("Sum of byte and short in int: "+i);
		l = s + i;
		System.out.println("Sum of short and int in long: "+l);
		f = i + l;
		System.out.println("Sum of int and long in float: "+f);
		d = l + f;
		System.out.println("Sum of long and float in double: "+d);
	}

}

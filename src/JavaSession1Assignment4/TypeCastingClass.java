package JavaSession1Assignment4;

import java.util.Scanner;

public class TypeCastingClass {

	public static void main(String[] args) {
		//Defining six variables for six data types
		byte b;
		short s;
		int i;
		long l;
		float f;
		double d;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in); //Scanner class is used to accept input from user
		System.out.println("Enter the value for byte variable");
		b = input.nextByte();
		System.out.println("Enter the value for short variable");
		s = input.nextShort();
		
		i = b + s; //Type-casting is performed to integer type from byte and short type
		System.out.println("Sum of byte and short in int: "+i);
		l = s + i; //Type-casting is performed to long type from short and integer type
		System.out.println("Sum of short and int in long: "+l);
		f = i + l; //Type-casting is performed to float type from integer and long type
		System.out.println("Sum of int and long in float: "+f);
		d = l + f; //Type-casting is performed to double type from long and float type
		System.out.println("Sum of long and float in double: "+d);
	}

}

package annemcgloughlin;

public class usingPrintF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Conversion Data Types:");

		//Integer
		System.out.printf("Printing an int: %d%n", 10);
		
		//floating point decimal
		System.out.printf("Printing a decimal: %f%n", 2.56);
		
		//characters
		System.out.printf("Printing out a character: %c%n", 'a');
		
		//string
		System.out.printf("Printing out a string: %s%n", "Hello, World!");
		
		//boolean
		System.out.printf("Printing out a boolean: %b%n", 10 < 11);
		
		System.out.println();
		System.out.println("Indexes:");
	
		System.out.printf("%d,%d,%d,%d,%d%n", 100, 200, 300, 400, 500);
		System.out.printf("%1$d,%1$d,%1$d,%1$d,%1$d%n", 100, 200, 300, 400, 500);
		System.out.printf("%2$d,%2$d,%2$d,%2$d,%2$d%n", 100, 200, 300, 400, 500);
		System.out.printf("%3$d,%3$d,%3$d,%3$d,%3$d%n", 100, 200, 300, 400, 500);
		System.out.printf("%4$d,%4$d,%4$d,%4$d,%4$d%n", 100, 200, 300, 400, 500);
		System.out.printf("%5$d,%5$d,%5$d,%5$d,%5$d%n", 100, 200, 300, 400, 500);
		System.out.printf("%5$d,%4$d,%3$d,%2$d,%1$d%n", 100, 200, 300, 400, 500);
		System.out.printf("%d,%<d,%d,%5$d,%d%n", 100, 200, 300, 400, 500);

		System.out.println();
		System.out.println("Flags:");
		System.out.println();
		System.out.println("Dash Flag:");
		System.out.println("Without the Flag:");
		//Dash Flags: - Without the flag
		System.out.printf("Width = 0: %d and %d%n", 100, 200);
		System.out.printf("Width = 5: %5d and %d%n", 100, 200);
		System.out.printf("Width = 10: %10d and %d%n", 100, 200);
		System.out.printf("Width = 15: %15d and %d%n", 100, 200);
		
		System.out.println();
		System.out.println("With the Flag:");
		//Dash Flags: - With the flag
		System.out.printf("Width = 0: %d and %d%n", 100, 200);
		System.out.printf("Width = 5: %-5d and %d%n", 100, 200);
		System.out.printf("Width = 10: %-10d and %d%n", 100, 200);
		System.out.printf("Width = 15: %-15d and %d%n", 100, 200);
		System.out.printf("Width = 20: %-20d and %d%n", 100, 200);

		System.out.println();
		System.out.println("Plus Flag:");
		//Plus Flags: 
		System.out.printf("Plus: %d and %+d and %+d%n", 100, 100, -100);
		
		System.out.println();
		System.out.println("Space Flag:");
		//Space Flags: - With the flag
		System.out.println("With the Flag:");
		System.out.printf(" % d%n", -200);
		System.out.printf(" % d%n", 200);
		System.out.printf(" % d%n", -200);

		System.out.println();
		System.out.println("Without the flag:");
		//Space Flags: - Without the flag
		System.out.printf(" %d%n", -200);
		System.out.printf(" %d%n", 200);
		System.out.printf(" %d%n", -200);

		System.out.println();
		System.out.println("Zero Flag:");
		//Zero Flag: 
		System.out.printf("Leading Zeros:%5d%n", 1);
		System.out.printf("Leading Zeros:%05d%n", 1);

		System.out.println();
		System.out.println("Comma Flag:");
		//Comma Flag:
		System.out.printf("Comma: %d and %d%n", 23, 2345);
		System.out.printf("Comma: %,d and %,d%n", 23, 2345);
		System.out.printf("Comma: %0,8d and %,8d%n", 2456, 2456);

		System.out.println();
		System.out.println("Bracket Flag:");
		//Bracket Flag:
		System.out.printf("Bracket: %(d and %(d and %d%n", 100, -100, -100); 
		
		System.out.println();
		System.out.println("Width:");
		//Width
		System.out.printf("Width = 0: %d%n", 100);
		System.out.printf("Width = 5: %5d%n", 100);
		System.out.printf("Width = 10: %10d%n", 100);
		System.out.printf("Width = 15: %15d%n", 100);
		System.out.printf("Width = 20: %20d%n", 100);
		
		System.out.println();
		System.out.println("Precision:");
		//Precision:
		System.out.printf("With precision: %.2f%n", 2.25);
		System.out.printf("Without precision: %f%n", 2.25);
		
	}

}

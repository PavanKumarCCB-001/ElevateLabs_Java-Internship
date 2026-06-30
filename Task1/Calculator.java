import java.util.Scanner;

public class Calculator {
	
	void Add(int a, int b) {
		System.out.println("Sum is "+(a+b));	}
	
	void Sub(int a, int b) {
		System.out.println("Difference is "+(a-b));	}
	
	void Mul(int a, int b) {
		System.out.println("Product is "+(a*b));	}
	
	void Div(int a, int b) {
		try {
			System.out.println("Quotient is "+(a/b));  } 
		catch (ArithmeticException e) {
			System.out.println("Can't Divide by Zero"); } 	}
	
	public static void main(String[] args) {
		
		Scanner ob = new Scanner(System.in);
		System.out.println("               Calculator                 ");
		
		Calculator obj = new Calculator();
		int ch,a,b;
		
		do {
			System.out.println("\n1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Exit");
			System.out.print("Enter Choice: ");
			ch = ob.nextInt();
			
			switch(ch) {
			case 1:
				System.out.println("Enter 2 No's");
				a = ob.nextInt();
				b = ob.nextInt();
				obj.Add(a, b);
				break;
			
			case 2:
				System.out.println("Enter 2 No's");
				a = ob.nextInt(); 
				b = ob.nextInt();
				obj.Sub(a, b);
				break;
			
			case 3:
				System.out.println("Enter 2 No's");
				a = ob.nextInt();
				b = ob.nextInt();
				obj.Mul(a, b);
				break;
			
			case 4:
				System.out.println("Enter 2 No's");
				a = ob.nextInt();
				b = ob.nextInt();
				obj.Div(a, b);
				break;
			
			case 5:
				break;
			
			default:
				System.out.println("Invalid Choice");
				break; }
		} while (ch != 5);
		
		ob.close(); } }
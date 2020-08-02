import java.util.*;
public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a,b;
		char op;
		System.out.println("Enter 1st Number:");
		Scanner scan=new Scanner(System.in);
		a=scan.nextFloat();
		System.out.println("Enter 2nd Number:");
		b=scan.nextFloat();
		System.out.println("Enter the Operator(+,-,*,/,%): ");
		op=scan.next().charAt(0);
		switch(op) {
		case '+':System.out.println("Sum of "+a+"and "+b+"is = "+(a+b));
				break;
		case '-':System.out.println("Sub of "+a+"and "+b+"is = "+(a-b));
				break;
		case '*':System.out.println("Mul of "+a+"and "+b+"is = "+a*b);
				break;
		case '/':System.out.println("Div of "+a+"and "+b+"is = "+a/b);
				break;
		case '%':System.out.println("Rem of "+a+"and "+b+"is = "+a%b);
				break;

		}
		
		
		
	}

}

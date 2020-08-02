import java.util.*;

public class loops {

	public static void main(String[] args) {
		int a,b,c,d;
		a=10;
		b=20;
		c=30;
		d=20;
		
		
		//If Else Nested if loop
		if(a==b)
		{
			System.out.println("Both are Equal");
		}
		else if (b!=d) {
			System.out.println("Both are Unequal");	
		}
		else if(a<=b) {
			System.out.println("a less than b");
		}
		
		//nested if
		if (b==d) {
			System.out.println("B and D are Equal");
			if (a!=c){
				System.out.println("a and c are not Equal");
			if(a<=b) {
				System.out.println("A is less than B");	
			if(c>d) {
				System.out.println("C is greater than D");
			}
			}
			}	
		}
		
		//Terneary Operators
		if(b==d && a!=c || c>d && a<=b) {
			System.out.println("&& and || are two important tertiary operators");		
		}
		
		int i=0;
		//While Loops
		while(i<20) {
			System.out.println(i);
			i=i+1;
		}
		
		
		//For loop
		for(i=1;i<=20;i++) {
			System.out.println(i);
		}
		
		
		//Switch Lopp
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Day");
		int day=scan.nextInt();
		switch(day) 
		{
			  case 1:
			    System.out.println("Monday");
			    break;
			  case 2:
			    System.out.println("Tuesday");
			    break;
			  case 3:
			    System.out.println("Wednesday");
			    break;
			  case 4:
			    System.out.println("Thursday");
			    break;
			  case 5:
			    System.out.println("Friday");
			    break;
			  case 6:
			    System.out.println("Saturday");
			    break;
			  case 7:
			    System.out.println("Sunday");
			    break;
		}
		
		
		//1-D Array  Operation
		  Scanner s = new Scanner(System.in);
	      System.out.println("Enter the length of the array:");
	      int length = s.nextInt();
	      int [] myArray = new int[length];
	      System.out.println("Enter the elements of the array:");

	      for(int j=0; j<length; j++ ) {
	         myArray[j] = s.nextInt();
	      }

	      System.out.println(Arrays.toString(myArray));
		
		// TODO Auto-generated method stub

	}

}

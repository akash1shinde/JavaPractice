import java.util.Scanner;

public class NewPractice {	

Scanner scanner = new Scanner(System.in);
public void MyMethode(int choice) {
	switch(choice) {
	case 1:

		
		System.out.println("enter the values");
		int a =	scanner.nextInt();
		int b = scanner.nextInt();	
	System.out.println("addition " +(a+b));
	break;
	
	case 2:
		System.out.println("enter the values");
		int a1 = scanner.nextInt();
		int b1 = scanner.nextInt();
		System.out.println("subs " +(a1-b1));
	break;
	
	case 3:
		System.out.println("enter the value");
		int a2= scanner.nextInt();
		int b2= scanner.nextInt();
		System.out.println("multiplication "+(a2*b2));
		break;
		
	default :
	System.out.println("Invalid choice");
	}
	
}

public static void main(String[] args) {
	NewPractice my = new NewPractice();
	Scanner scanner = new Scanner(System.in);
	System.out.println(" 1. addition\n 2. substraction\n 3. multiplication\n");

    System.out.print("Enter your choice : ");
	int choice = scanner.nextInt();

	my.MyMethode(choice);
	
	
	
}


}

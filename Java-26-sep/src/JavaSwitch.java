import java.util.Scanner;

public class JavaSwitch {
	 private void checkSwitchCase(int choice,int a,int b) {

	        switch (choice) {

	            case 1:
	                System.out.println("addition : "+(a+b));
	                break;
	            case 2:
	                System.out.println("sub : "+(a-b));
	                break;
	            case 3:
	                System.out.println("mul : "+(a*b));
	                break;

	            default:
	                System.out.println("Invalid choice");
	        }


	    }

	    public static void main(String[] args) {

	    	JavaSwitch demo=new JavaSwitch();
	        Scanner scanner=new Scanner(System.in);
	        System.out.println("1 . Add\n2 . Sub\n3 . Mul");
	        System.out.print("Enter your choice : ");
	        int choice=scanner.nextInt();
	        System.out.print("Enter the values : ");
	        int a=scanner.nextInt();
	        int b=scanner.nextInt();
	        demo.checkSwitchCase(choice,a,b);
	    }
}

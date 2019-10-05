import java.util.Scanner;

public class Practice {
	
Scanner scanner=new Scanner(System.in);

    public void checkSwitchCase(int choice) {

        switch (choice) {

            case 1:
            	
    	        System.out.print("Enter the values : ");
    	        int a=scanner.nextInt();
    	        int b=scanner.nextInt();
    	        
            	System.out.println("addition : "+(a+b));
                
                break;
            case 2:
            	System.out.print("Enter the values : ");
    	        int a1=scanner.nextInt();
    	        int b1=scanner.nextInt();
    	        
                System.out.println("sub : "+(a1-b1));
                break;
            case 3:
    	        System.out.print("Enter the values : ");
    	        int a11=scanner.nextInt();
    	        int b11=scanner.nextInt();
    	        
                System.out.println("mul : "+(a11*b11));
                break;

            default:
                System.out.println("Invalid choice");
        }


    }

    public static void main(String[] args) {

    	Practice demo=new Practice();
        Scanner scanner=new Scanner(System.in);
        System.out.println("1 . Add\n2 . Sub\n3 . Mul");
        System.out.print("Enter your choice : ");
        int choice=scanner.nextInt();
        demo.checkSwitchCase(choice);
    }	

}

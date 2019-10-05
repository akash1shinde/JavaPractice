import java.util.Scanner;

public class JavaLoops {
	
	public void prime() {
Scanner scanner = new Scanner(System.in);

  System.out.println("enter the number");
  int num = scanner.nextInt();
  int b = 1;
  int c=0;
  for(b=1;b<=num;b++) {
	  { if((num%b)==0)
		
		  c=c+1;
	  }
	  b++;
  }
  
   if(c==2) {
	   System.out.println("number is prime");
   }  
   else {
	   System.out.println("number is not prime");
   }

}
	public static void main(String[] args) {
		JavaLoops loop = new JavaLoops();
		loop.prime();
		
	}
	
}
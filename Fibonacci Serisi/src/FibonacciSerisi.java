import java.util.Scanner;
public class FibonacciSerisi {

	public static void main(String[] args) {
		    int top=0,a,b=1;
		    
		      Scanner scan = new Scanner(System.in);
		    
		    System.out.println("sayýyý giriniz");
		    int sayi = scan.nextInt();

		    for(int i=0; i<sayi;i++){
		        
		      a=b;
		      b=top;
		      top=a+b;
		      System.out.println(top);
		    }
		  }
	}


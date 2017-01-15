import java.util.Scanner;

public class assign21{
    public static void main(String args[]){
	int n, factorial=1, i;
	Scanner in = new Scanner(System.in);
	System.out.print("Enter the number: ");
	n = in.nextInt();
	for(i = n; i > 0; i--){
	    factorial = factorial * i;
	}
	System.out.println("Factorial: "+factorial);
    }
}

import java.util.Scanner;

public class assign23{
    public static void main(String args[]){
	int n, i;
	int[] fib = new int[20];
	Scanner in = new Scanner(System.in);
	System.out.print("Enter the number of terms: ");
	n = in.nextInt();
	fib[0] = 0;
	fib[1] = 1;
	for(i = 2; i < n; i++){
	    fib[i] = fib[i-1] + fib[i-2];
	}
	System.out.println("SERIES:");
	for(i = 0; i < n; i++){
	    System.out.println(fib[i]);
	}
    }
}

import java.util.Scanner;

public class assign22{
    public static void main(String args[]){
	int x, rev=0,temp;
	Scanner in = new Scanner(System.in);
	System.out.print("Enter the number: ");
	x = in.nextInt();
	while(x > 0){
	    temp = x % 10;
	    x = x/10;
	    rev = temp + (rev*10);
	}
	System.out.println("Reverse: "+rev);
    }
}
	    

import java.util.Scanner;

public class assign25{
    public static void main(String args[]){
	int a, b, c;
	System.out.println("Enter three numbers:");
	Scanner in = new Scanner(System.in);
	a = in.nextInt();
	b = in.nextInt();
	c = in.nextInt();
	System.out.println("Largest:");
	if(a > b && a > c){
	    System.out.println(a);
	}
	else if(b > a && b > c){
	    System.out.println(b);
	}
	else if(c > a && c > b){
	    System.out.println(c);
	}
    }
}

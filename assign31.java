import java.util.Scanner;

public class assign31{
    public static void main(String args[]){
	int a, b, c, d;
	Scanner in = new Scanner(System.in);
	a = in.nextInt();
	b = in.nextInt();
	c = in.nextInt();
	d = c > (a>b ? a : b) ? c : (a>b ? a : b);
	System.out.println("Largest: "+d);
    }
}

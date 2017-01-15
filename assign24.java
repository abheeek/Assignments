import java.util.Scanner;
import java.lang.Math;

public class assign24{
    public static void main(String args[]){
	int n, temp, digits=0, armstrong=0, d;
	Scanner in = new Scanner(System.in);
	System.out.print("Enter the number: ");
	n = in.nextInt();
	temp = n;
	while(temp > 0){
	    temp = temp/10;
	    digits++;
	}
	temp = n;
	while(temp > 0){
	    d = temp%10;
	    temp = temp/10;
	    armstrong = armstrong + (int)Math.pow(d, digits);
	}
	if(armstrong == n){
	    System.out.println("The number is an Armstrong number");
	}
	else{
	    System.out.println("The number is NOT an Armstrong number");
	}
    }
}

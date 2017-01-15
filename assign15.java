import java.util.Scanner;

public class assign15{
    public static void main(String args[]){
	int x, flag, loop=1,i;
	Scanner in = new Scanner(System.in);
	while(loop==1){
	    flag = 0;
	    System.out.print("Enter a number: ");
	    x = in.nextInt();
	    if(x==1){
		System.out.println("Neither prime nor composite");
	    }
	    else{
	    for(i = 2; i <= (x/2); i++){
		if(x % i == 0){
		    flag = 1;
		    break;
		}
	    }
	    if(flag == 1){
		System.out.println("Composite number");
	    }
	    else{
		System.out.println("Prime number");
	    }
	    }
	    System.out.println("Continue? (yes=1 no=0)");
	    loop = in.nextInt();
	    
	}
    }
}

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int one = 1;
		int sp = n-1;
	for(int i=1;i<=n;i++){
	    for(int j=1;j<=sp;j++){
	        System.out.print(" ");
	    }
	    for(int j=1;j<=one;j++){
	        System.out.print("1");
	    }
	    System.out.println();
	    one+=2;
	    sp--;
	}
	}
}

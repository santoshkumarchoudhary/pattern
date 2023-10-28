import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sp =-1;
		int st = n;
		for(int i=1;i<=n;i++){
		    for(int j=1;j<=st;j++){
		        System.out.print("*");
		    }
		    for(int j=1;j<=sp;j++){
		        System.out.print(" ");
		    }
		    for(int j=1;j<=st;j++){
		        if(i==1 && j==st) continue;
		        System.out.print("*");
		    }
		    st--;
		    sp+=2;
		    System.out.println();
		}
	}
}

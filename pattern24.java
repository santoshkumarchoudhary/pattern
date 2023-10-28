import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int st =1;
		int sp = n-1;
		for(int i=1;i<=n;i++){
		    for(int j=1;j<=sp;j++){
		        System.out.print(" ");
		    }
		    for(int j=1;j<=st;j++){
		        System.out.print(i);
		    }
		    st+=2;
		    sp--;
		    System.out.println();
		}
	}
}


import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sp =n-1;
		int st =n;
		for(int i=1;i<=2*n-1;i++){
		    for(int j=1;j<=sp;j++){
		        System.out.print(" ");
		    }
		    for(int j=1;j<=st;j++){
		        System.out.print("*");
		    }
		    System.out.println();
		    if(i<n){
		        sp--;
		        st--;
		    }else{
		        sp++;
		        st++;
		    }
		}
	}
}
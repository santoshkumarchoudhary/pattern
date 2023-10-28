import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int st =0;
		int sp =n-1;
		for(int i=n;i>=1;i--){
		    for(int j=1;j<=sp;j++){
		        System.out.print("  ");
		    }
		    int count = i;
		    for(int j=1;j<=st;j++){
		        System.out.print(count+" ");
		        count++;
		    }
		    System.out.print(0+" ");
		    int count2 = n-1;
		    for(int j=1;j<=st;j++){
		        System.out.print(count2+" ");
		        count2--;
		    }
		    System.out.println();
		    sp--;
		    st++;
		}
	}
}

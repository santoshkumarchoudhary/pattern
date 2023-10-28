import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int st =1;
		int count =1;
		for(int i=1;i<=2*n-1;i++){
		   for(int j=1;j<=st;j++){
		       if(j%2==1){
		           System.out.print(count+" ");
		       }else{
		           System.out.print("*"+" ");
		       }
		   }
		   if(i<n){
		       st+=2;
		       count++;
		   }else{
		       st-=2;
		       count--;
		   }
		   System.out.println();
		}
	}
}


import java.util.*;
public class Main
{
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
       int st=1;
       int sp =2*n-3;
       for(int i=1;i<=n;i++){
             for(int j=1;j<=st;j++){
                System.out.print("*");
             }
             for(int j=1;j<=sp;j++){
               System.out.print(" ");
            }
             for(int j=1;j<=st;j++){
                 if(i==n && j==st)continue;
                System.out.print("*");
             }
            System.out.println();
                st++;
                sp-=2;
            }
        }
	}

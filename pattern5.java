/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=n-1;i>=0;i--){
		    for(int j=0;j<n-i;j++){
		        System.out.print(" ");
		    }
		    for(int j=0;j<=i;j++){
		        System.out.print("*");
		    }
		    System.out.println();
		}
	}
}

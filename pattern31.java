import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++){
		    int val =n;
		    for(int j=1;j<=n;j++){
		        if(val==i){
		        System.out.print("* ");
		       
		    }else{
		        System.out.print(val+" ");
		    }
		    val--;
		    }
		    System.out.println();
		}
	}
}


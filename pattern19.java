import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 7;
        int star = (n/2) + 1;
        int space = 0;
        for(int row=1;row<=n/2;row++){
            for(int i=1;i<=star;i++){
                System.out.print("*\t");
            }
            
            for(int i=1;i<=space;i++){
                System.out.print("\t");
            }

        
            for(int i=2;i<=space;i++){
                System.out.print("\t");
            }
        
            for(int i=1;i<=star;i++){
                if(row == 1 && i == star){
                    continue;
                }else{
                    System.out.print("*\t");
                }
            }

            if(row<=n/2){
                star--;
                space+=1;
            }else{
                star++;
                space-=1;
            }

            System.out.println();
        }


        star = 1;
        space = n/2;
        for(int row=1;row<=n/2+1;row++){

            for(int j=1;j<=star;j++){
                System.out.print("*\t");
            }
        
            for(int i=1;i<=space;i++){
                System.out.print("\t");
            }

            
            for(int i=1;i<space;i++){
                System.out.print("\t");
            }
            
            for(int j=1;j<=star;j++){
                if(j == n/2 +  1){
                    continue;
                }else{
                    System.out.print("*\t");
                }
            }

            if(row<=n/2){
                space-=1;
                star++;
            }else{
                star--;
                space+=1;
            }

            System.out.println();
        }
    }
}

import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 7;
        int star = 1;
        int space = n/2;
        for(int row=1;row<=n;row++){
            // space
            for(int i=1;i<=space;i++){
                System.out.print("\t");
            }
            for(int i=1;i<=star;i++){
                if(i==1){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }

        
            for(int i=2;i<=star;i++){
                if(i==star){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
        
            for(int i=1;i<=space;i++){
                System.out.print("\t");
            }

            if(row<=n/2){
                space--;
                star++;
            }else{
                star--;
                space++;
            }
            System.out.println();
        }


    }
}

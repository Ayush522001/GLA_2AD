package Lec_8;

import java.util.Scanner;

public class Bin_to_dec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

        int multiplier=1;
        int result=0;
        while (n!=0){
            int rem=n%10;
            result=result+(rem*multiplier);
            multiplier=multiplier*2;
            n=n/10;
        }
        System.out.println(result);
    }
}

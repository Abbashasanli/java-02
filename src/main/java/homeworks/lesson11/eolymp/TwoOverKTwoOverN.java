package homeworks.lesson11.eolymp;

import java.util.Scanner;

public class TwoOverKTwoOverN {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a= scan.nextInt();
        int b= scan.nextInt();
        System.out.println((int) Math.pow(2,a)+(int) Math.pow(2,b));
    }
}

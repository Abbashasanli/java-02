package homeworks.eolymp.basics;

import java.util.Scanner;

public class PerimeterApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println(2 * (a + b));
    }
}

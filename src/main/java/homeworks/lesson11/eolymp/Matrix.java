package homeworks.lesson11.eolymp;


import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(i * m + j + 1 + " ");

            }
            System.out.println();

        }

    }
}







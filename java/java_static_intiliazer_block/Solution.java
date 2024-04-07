package java.java_static_intiliazer_block;

import java.util.Scanner;

public class Solution {

    static int B;
    static int H;
    static boolean flag =false;


    static {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();
        scanner.close();

        if (B<=0 || H<=0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");   
        }else {
            flag =true;
        }
    }

    public static void main(String[] args) {
        int area = B * H;
        if (flag) {
            System.out.println(area);
        }
    }
    
}

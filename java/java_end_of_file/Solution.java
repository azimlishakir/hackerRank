package java.java_end_of_file;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int counter = 0;
        for (counter=1; sc.hasNext(); counter++) {
            System.out.println(counter + " " + sc.nextLine());

        }
    }
}

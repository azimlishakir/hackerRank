package java.java_string_reverse;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        StringBuilder reverse = new StringBuilder();
        String ans;


        for(int i = str.length()-1; i>=0; i--) {
            reverse.append(str.charAt(i));
        }

        if (str.equalsIgnoreCase(reverse.toString())) {
            ans = "Yes";
        }else {
            ans = "No";
        }

        System.out.println(ans);


    }
    
}

package java.prime_number;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            BigInteger asal = new BigInteger(bufferedReader.readLine());
            if (number.isProbablePrime(1)) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        } catch (IOException e) {
            System.out.println("Could not validate input");
        }
    }
}

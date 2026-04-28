package TA_CF;

import java.util.Scanner;

public class Morning_CF {
//	https://codeforces.com/problemset/problem/1883/A
//	Solution by ChatGPT
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String pin = sc.next(); // read as string
            pincode(pin);
        }
    }

    public static void pincode(String pin) {
        int current = 1;
        int time = 0;

        for (int k = 0; k < 4; k++) {
            int target = pin.charAt(k) - '0';
            if(target == 0) target = 10;
            time += Math.abs(current - target) + 1;
            current = target;
        }

        System.out.println(time);
    }
}

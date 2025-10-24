package org.example;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(10101);
        System.out.println(isPerfectNumber(10101);
        System.out.println(numberToWords(10101);
    }
    public static Boolean isPalindrome(int a){
        if (a<0){
            a *= -1;
        }
        String b = "";
        StringBuilder d = new StringBuilder();
        b += a;
        char[] c = b.toCharArray();
        for (int i = (c.length)-1;i>-1;i--){
            d.append(Character.toString(c[i]));
        }
        return b.equals(d.toString());
    }
    public static Boolean isPerfectNumber(int a){
        ArrayList<Integer> c = new ArrayList<>();
        int d=0;
        switch (a){
            case 1,2:
                return false;

            case 0:
                return true;

        }
        if (a<0){
            return false;
        }
        for (int i = 1;i<a;i++){
            if (a%i==0){
                c.add(i);
                System.out.println(c);
            }
        }
        for (Integer i : c){
            d+=i;
        }
        return d==a;
    }
    public static String numberToWords(int a){
        String l = "" + a;
        char[] o = l.toCharArray();
        String b = "";
        if (a<0){
            return "Invalid Value";
        }
        for (char c : o){
            int k = c - '0';
            switch (k){
                case 1:
                    b += " One";
                    break;
                case 2:
                    b += " Two";
                    break;
                case 3:
                    b += " Three";
                    break;
                case 4:
                    b += " Four";
                    break;
                case 5:
                    b += " Five";
                    break;
                case 6:
                    b += " Six";
                    break;
                case 7:
                    b += " Seven";
                    break;
                case 8:
                    b += " Eight";
                    break;
                case 9:
                    b += " Nine";
                    break;
                case 0:
                    b += " Zero";
                    break;
            }

        }
        b = b.trim();
        return b;
    }
}

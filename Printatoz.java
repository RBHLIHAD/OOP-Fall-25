package com.mycompany.printatoz;

public class Printatoz {
    public static void main(String[] args) {
        char ch = 'a';

        while (ch <= 'z') {
            System.out.print(ch + " ");

            if (ch == 'k') {
                break; // stop when 'k' is reached
            }

            ch++;
        }
    }
}

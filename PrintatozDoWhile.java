
package com.mycompany.printatozdowhile;


public class PrintatozDoWhile {

   public static void main(String[] args) {
        char ch = 'a';

        do {
            System.out.print(ch + " ");

            if (ch == 'k') {
                break; // stop when 'k' is reached
            }

            ch++;
        } while (ch <= 'z');
    }
}
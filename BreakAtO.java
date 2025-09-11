
package com.mycompany.breakato;

public class BreakAtO {

    public static void main(String[] args) {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch + " ");
            
            if (ch == 'o') {
                break; // stop the loop when 'o' is reached
            }
        }
    }
}
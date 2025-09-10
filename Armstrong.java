
package com.mycompany.armstrong;

public class Armstrong {

    public static void main(String[] args) {
        
        int number = 153;  
        int original = number;
        int sum = 0;
        
        while (number > 0) {
            int digit = number % 10;   
            sum = sum + (digit * digit * digit); 
            number = number / 10;       
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } 
        
        else 
        {
            System.out.println(original + " is NOT an Armstrong number.");
        }
    }
}

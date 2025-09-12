
package com.mycompany.printatozusingwhileloop;


public class PrintAtoZUsingWhileLoop {

   public static void main(String[] args) {
        
        char i='A';
        
        while(true)
        {
            System.out.println(" " +i);
            
            if(i=='k')
            {
                break;
            }
            i++;
        }
    }
}

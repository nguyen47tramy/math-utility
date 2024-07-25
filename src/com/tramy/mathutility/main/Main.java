
package com.tramy.mathutility.main;

import com.tramy.mathutility.core.MathUtility;

public class Main {
    public static void main(String[] args) {
        
        //Phải đưa ra các tình huống dùng hàm trong tình huống
        //Testcase: Một tình huống hàm được đưa vào sử dụng
        //          Giả lập hành vi sử dụng của user 
        // getFactorial(-2)
        // getFactorial(-0)
        // getFactorial(0)
        // getFactorial(1)
        // getFactorial(20)
        // getFactorial(21)
        //          So sánh đầu vào với output đầu ra
        //          test automation là viết hàm để nó so sánh tự động        
        
        long expected = 120;
        int n = 5;
        long actual = MathUtility.getFactorial(n);
        
        System.out.println("5! expected = " + expected + " actual = " + actual);        
        if (actual == expected)            
            System.out.println("Pass"); 
        
        else            
            System.out.println(" Do not Pass");
        
        
    }
}

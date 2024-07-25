
package com.tramy.mathutility.core;

public class MathUtility {
    
    public static long getFactorial(int n){
        
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("must be between 0 and 20");
        
        if (n == 1 || n == 0)
            return 1;
        
        long product = 1;
        for (int i = 2; i <= n; i++) {
            product *= i;            
        }
        return product;
        //tránh viết else trong những trường hợp tường minh
    }
}

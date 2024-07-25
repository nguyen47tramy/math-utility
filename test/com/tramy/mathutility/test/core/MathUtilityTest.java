
package com.tramy.mathutility.test.core;

import com.tramy.mathutility.core.MathUtility;
import junit.framework.Assert;
import org.junit.Test;


public class MathUtilityTest {
    
    //có nhiều quy tắc đặt tên hàm kiểm thử
    //nhưng thường sẽ là nói lên mục đích của các tình huống dùng hàm
    
    //trường hợp chạy thành công
    @Test   //JUnit sẽ phối hợp với JVM để chạy kịch bản test này
            //@Test chính là public static void main
            //quy ước để chạy nhiều main để chạy nhiều case
    public void testGetFactorialGivenRightArgumentReturnsWell(){
        //ten class == tên test case
        
        int n = 0;
        long expected = 1;
        long actual = MathUtility.getFactorial(n);
        
        Assert.assertEquals(expected, actual);
        
    }
    
    //Test case:
    //input: -5
    //expected: throw IllegelArgumentException
    //tình huống nay fkhoong thể dùng so sánh Assert.Equals
    
    @Test(expected = IllegalArgumentException.class)
          //hy vọng xảy ra ngoại lệ
          //expected phải kỳ vọng chính xác ngoại lệ mình đã thiết kế nó ném ra
          //phải coi kỳ vọng là ngoại lệ để bắt, try- catch
          //không bắt ngoại lệ -> testcase sai -> kết quả trả về Fail
    public void testGetFactorialGivenWrongArgumentThrowsException(){
        MathUtility.getFactorial(-5);
    }
    
    /*
    //Các khác để bắt ngoại lệ - JUnit 5
    //Dùng LambdaExpression
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_LambaExpression(){
        
        //Assert.assertThrows(tham số 1: ngoại lệ muốn so sánh,
        //                    tham số 2: đoạn code chạy ra ngoại lệ - runable);
        
        Assert.assertThrows(IllegalArgumentException.class,
                            () -> MathUtility.getFactorial(-5));
               
    }
    
    */
    
    //Dùng Try-Catch bắt ngoại lệ
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_TryCatch(){
        
        try {
            MathUtility.getFactorial(-5);
        } catch (Exception e) {
            //so sánh exception thực tế được né với exception trong thiết kế cảu mình
            
            Assert.assertEquals("must be between 0 and 20", 
                                e.getMessage() );
        }
               
    }
    
}

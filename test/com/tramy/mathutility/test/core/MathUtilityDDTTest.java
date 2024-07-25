
package com.tramy.mathutility.test.core;

import com.tramy.mathutility.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
//đây là cách framework yêu cầu viết để chương trình khi chạy biết vào đâu lấy data test
//câu lệnh cảu JUnit báo hiệu rằng sẽ cần loop qua tập data để lấy các cặp data nhồi vào hàm
public class MathUtilityDDTTest {
    
    //Hàm trả về mảng hai chiều Wrapper Class [expected][actual]
    //là hàm static 
    @Parameterized.Parameters
    public static Object[][] initData(){
        return new Integer[][] {
                                    {0, 1},
                                    {1, 1},
                                    {2, 2},
                                    {3, 6},
                                    {4, 24},
                                    {5, 720},
        };
    }
    
    //Map value của cột vào biến input và expected để feed cho hàm
    @Parameterized.Parameter(value = 0)
    public int input;
    @Parameterized.Parameter(value = 1)
    public long expected; //hàm getFactorial() trả về kiểu long
    
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell(){
        Assert.assertEquals(expected, MathUtility.getFactorial(input));
    }
}

package com.minicup.junittest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by gy on 2018/1/31.
 */

@RunWith(Parameterized.class)//1. 指定Runner
public class EvenTest {
    public Even even;


    //3. 绑定测试数据（通过注解）//变量不能为private value对应相应的值的下标
    @Parameterized.Parameter(value = 1)
    public boolean expectedResult;
    @Parameterized.Parameter
    public int number;


    //3. 绑定提供测试数据（通过构造函数）
//    private boolean expectedResult;
//    private int number;
//    public EvenTest(int number, boolean isEven) {
//        super();
//        this.expectedResult = isEven;
//        this.number = number;
//    }


    //2. 提供测试数据
    //参数应该与构造方法相对应
    @Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] {
                { 2, true },
                { 5, false },
                { 10, true }
        };
        return Arrays.asList(data);
    }


    @Before
    public void setUp(){
        even = new Even();
    }

    //4. 测试
    @Test
    public void isEven() throws Exception {
        boolean actualEven = even.isEven(number);
        System.out.println("inputNumber: " + number + "; expectedResult: " + expectedResult + "; actualResult:" + actualEven);
        Assert.assertEquals("expectedResult", expectedResult, actualEven);

    }

}
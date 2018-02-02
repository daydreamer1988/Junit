package com.minicup.junittest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;

/**
 * Created by gy on 2018/2/2.
 */

@RunWith(Enclosed.class)//Enclosed可以识别所有的静态内部类中的测试用例，并全部执行
public class EnclosedTest {

    public static class InnerClass{

        @Before
        public void setUp(){

        }

        @After
        public void tearDown(){

        }


        @Test
        public void start(){
            Assert.assertThat(3, is(3));
        }
    }



    public static class InnerClass2{

        @Before
        public void setUp(){

        }

        @After
        public void tearDown(){

        }


        @Test
        public void start2(){
            Assert.assertThat(3, is(3));
        }
    }

}

package com.minicup.junittest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import java.util.concurrent.TimeUnit;

/**
 * Created by gy on 2018/2/1.
 */

public class TimeoutRuleTest {

    @Rule
    public Timeout timeout = new Timeout(2000, TimeUnit.MICROSECONDS);

    @Test
    public void test1(){
        while (true) {
        }
    }

    @Test
    public void test2(){
        while (true) {
        }
    }

}

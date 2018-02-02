package com.minicup.junittest.catogory;

import org.junit.Test;
import org.junit.experimental.categories.Category;

/** * Created by gy on 2018/2/2.
 */

public class TestA {

    @Category(TypeA.class)
    @Test
    public void typeA(){

    }


    @Category(TypeB.class)
    @Test
    public void typeB(){

    }

}

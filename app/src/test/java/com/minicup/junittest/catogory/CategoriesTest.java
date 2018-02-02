package com.minicup.junittest.catogory;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by gy on 2018/2/2.
 */

@RunWith(Categories.class)
@Categories.IncludeCategory(TypeA.class)
@Categories.ExcludeCategory(TypeB.class)
@Suite.SuiteClasses({TestA.class, TestB.class})
public class CategoriesTest {
    //在SuiteClasses类中， 只运行不包含ExcludeCategory类型的IncludeCategory类型。
}


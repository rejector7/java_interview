package test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class JavaContainerTester {
    /**
     * 集合只能是引用类型，不能是基本类型
     */
    @Test
    public void test01(){
        Integer[] integerArray = new Integer[1];
//        List<int> intList = new ArrayList<>(); //Type argument cannot be of primitive type
        List<Integer> integerList = new ArrayList<>();
    }

    /**
     * 集合类接口
     */
    @Test
    public void test02(){
        Collection<Integer> c = new ArrayList<>();
    }
}

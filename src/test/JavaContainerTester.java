package test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
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

    /**
     *
     * 基本数据结构：数组。
     *
     * 数组类是在jvm中，动态生成的。
     * 无法在包中显式声明。因为数组类和元素类型，数组维度相关。
     * 需要根据这二者动态生成。
     * jvm生成类比较简单。
     *
     * 数组操作工具类：Arrays
     */
    @Test
    public void test03() {
        int[] intArray = new int[5];
        Class<? extends int[]> clazz = intArray.getClass();
        System.out.println(clazz.getName());

        Arrays.asList();
    }
}

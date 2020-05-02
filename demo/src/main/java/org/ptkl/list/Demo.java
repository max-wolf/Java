package org.ptkl.list;

import org.apache.commons.collections4.ListUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.jupiter.api.Test;

import java.util.*;

public class Demo {

    private static final Logger logger = LoggerFactory.getLogger(Demo.class);

    /*
    * Arrays.asList返回的是Arrays的内部类（没有重写add/remove方法），不是java.util.ArrayList*/
    @Test
    public void testAdd() {
        String[] arrays = {"1", "2", "3"};
        List<String> list = Arrays.asList(arrays);
        list.add("e");  // throw UnsupportedOperationException
        list.remove("1"); // throw UnsupportedOperationException
    }


    /*
     * Arrays.asList底层使用了原始数组，因此修改原数组或list集合都会互相影响
     * 解决方法：List<String> list = new ArrayList<>(Arrays.asList(arrays));*/
    @Test
    public void testModify() {
        String[] arrays = {"1", "2", "3"};
        List<String> list = Arrays.asList(arrays);
        list.set(0, "modify_1");
        logger.info("list:{}", list);    //list:[modify_1, 2, 3]
        logger.info("arrays:{}", Arrays.toString(arrays)); //arrays:[modify_1, 2, 3]
        arrays[1] = "modify_2";
        logger.info("list:{}", list);    //list:[modify_1, modify_2, 3]
        logger.info("arrays:{}", Arrays.toString(arrays)); //arrays:[modify_1, modify_2, 3]
    }

    /*
     * subList生成的集合与原list也会互相影响*/
    @Test
    public void testSubList() {
        List<String> list = new ArrayList<>(Arrays.asList("a","b","c"));
        List<String> subList = list.subList(0, 2);
        logger.info("list:{}", list);   //list:[a, b, c]
        logger.info("subList:{}", subList); //subList:[a, b]
        list.set(0, "t");
        subList.set(1, "v");
        logger.info("list:{}", list);   //list:[t, v, c]
        logger.info("subList:{}", subList); //subList:[t, v]
    }

    /*
     * 修改原list会影响 Collections.unmodifiableList生成的不可变list*/
    @Test
    public void testUnmodifiable() {
        List<String> list = new ArrayList<>(Arrays.asList("a","b","c"));
        List<String> unmodifiableList = Collections.unmodifiableList(list);
        list.set(0, "modify");
        logger.info("unmodifiableList:{}",unmodifiableList);
    }

    /*
    * foreach增加/删除元素会报错
    * */
    @Test
    public void testForeachModify() {
        List<String> list = new ArrayList<>(Arrays.asList("a","b","c","d"));
        //报错
//        for (String str : list) {
//            if (StringUtils.equals(str, "b")) {
//                list.remove(str);
//            }
//        }
        //等价方法
        Iterator var2 = list.iterator();
        while(var2.hasNext()) {
            String str = (String)var2.next();
            if (StringUtils.equals(str, "b")) {
                list.remove(str);
            }
        }

        //修复方法1
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            String str = iterator.next();
//            if (StringUtils.equals(str, "a")) {
//                iterator.remove();
//            }
//        }

        //修复方法2
//        list.removeIf(str -> StringUtils.equals(str, "a"));
    }
}

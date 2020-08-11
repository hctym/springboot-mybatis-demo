package com.hctym.springmybatis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {

    public static void main(String[] args) throws ClassNotFoundException {
//
//        Collections.singletonList("xlc");
//                System.out.println(Collections.singletonList("xlc"));
//                System.out.println(Collections.singletonMap("xlc","xulinchuang"));
//        List list = new ArrayList();
//        list.add("12");
//        list.add("1");
//        list.add("0");
//        list.add("22");
//        System.out.println(Collections.sort(list));
//
//        String string
//
//                Li


        ClassLoader classLoader1 = Demo.class.getClassLoader();
        System.out.println(classLoader1);
        classLoader1 = classLoader1.getParent();
        System.out.println(classLoader1);
        System.out.println(classLoader1.getParent());

        MyClassLoader classLoader = new MyClassLoader();
        classLoader.findClass("D:\\gitee\\mm\\target\\classes\\com\\zhsj\\mm\\bean\\Account.class");

    }
}

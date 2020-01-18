package com.ibn.sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class TestCollectionDemo {

    public static void main(String[] args) {

        // ArrayList
        System.out.println("ArrayList###############################");
        List<String> list = new ArrayList<String>();

        list.add("listElement1");
        list.add("listElement2");
        list.add("listElement3");

        System.out.println("-------------------");
        // ，第一种遍历方式，使用for
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("-------------------");
        // ，第二种遍历方式，使用foreach
        for (String str : list) {
            System.out.println(str);
        }

        // ，第三种遍历方式,使用迭代器
        System.out.println("-------------------");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            System.out.println(next);
        }

        // LinkedList
        System.out.println("LinkedList###############################");
        // ，利用LinkedList来模拟栈，栈的特点：先进后出
        // ，压栈
        LinkedList<String> linkList = new LinkedList<String>();
        linkList.addFirst("我是第1位");
        linkList.addFirst("我是第2位");
        linkList.addFirst("我是第3位");

        System.out.println("压栈-------------------");
        //，第二种遍历方式，使用foreach
        for (String str : linkList) {
            System.out.println(str);
        }
        for (int i = 0; i < linkList.size(); i++) {
            System.out.println(linkList.get(i));
        }
        System.out.println("压栈-------------------End");

        // ，出栈
        System.out.println("出栈-------------------");
        System.out.println(linkList.removeFirst());
//        System.out.println(linkList.removeFirst());
//        System.out.println(linkList.removeFirst());

        // ，作业：
        // ，利用LinkedList来模拟队列，队列的特点：先进先出

        // ，入列
        linkList.addFirst("我是第1位");
        linkList.addFirst("我是第2位");
        linkList.addFirst("我是第3位");

        System.out.println("入列-------------------");
        // ，第二种遍历方式，使用foreach
        for (String str : linkList) {
            System.out.println(str);
        }

        // ，出列
        System.out.println("出列-------------------");
        System.out.println(linkList.removeLast());
//        System.out.println(linkList.removeLast());
//        System.out.println(linkList.removeLast());

        // HashSet
        System.out.println("HashSet###############################");
        Set<String> set = new HashSet<String>();

        set.add("我是独一无二的存在");
        set.add("我是重复的");
        set.add("我是重复的");
        set.add("我也是独一无二的存在");

        // ，遍历 第一种方式 foreach
        System.out.println("1###############################");
        for (String str : set) {
            System.out.println(str);
        }

        set.clear();
        set.add("我是重复的");
        set.add("我是重复的");
        set.add("我也是独一无二的存在");
        set.add("我是独一无二的存在");

        // ，遍历 第二种方式 迭代器
        System.out.println("2###############################");
        for (String str : set) {
            System.out.println(str);
        }
        Iterator<String> it1 = set.iterator();
        while (it1.hasNext()) {
            String str = it1.next();
            System.out.println(str);
        }

        // LinkedHashSet
        System.out.println("LinkedHashSet###############################");
        LinkedHashSet<String> lhset = new LinkedHashSet<String>();

        lhset.add("我是独一无二的存在");
        lhset.add("我是重复的");
        lhset.add("我是重复的");
        lhset.add("我也是独一无二的存在");

        // ，遍历 第一种方式 foreach
        System.out.println("###############################");
        for (String str : lhset) {
            System.out.println(str);
        }

        lhset.clear();
        lhset.add("我是重复的");
        lhset.add("我是重复的");
        lhset.add("我也是独一无二的存在");
        lhset.add("我是独一无二的存在");

        // ，遍历 第二种方式 迭代器
        System.out.println("###############################");
        Iterator<String> it2 = lhset.iterator();
        while (it2.hasNext()) {
            String str = it2.next();
            System.out.println(str);
        }

        // HashMap
        System.out.println("HashMap&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        HashMap<String, String> map = new HashMap<String, String>();

        map.put("JAVA", "Spring");
        map.put("IOS", "ObjectC");
        map.put("JS", "ES7");
        map.put("PHP", "ThinkPHP");
        map.put("C++", "Whatever");
        // ，遍历 第一种方式 foreach
        Set<String> keySet = map.keySet();
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        for (String key : keySet) {
        	System.out.println(key.getClass());
            System.out.println(key + "---" + map.get(key));
        }

        // ，遍历 第二种方式 迭代器
        Set<Entry<String, String>> entrySet = map.entrySet();
        Iterator<Entry<String, String>> it3 = entrySet.iterator();
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        while (it3.hasNext()) {
            Entry<String, String> entry = it3.next();
            System.out.println(entry.getKey() + "---" + entry.getValue());
        }

        // LinkedHashMap
        System.out.println("LinkedHashMap&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        // LinkedHashMap的特点就是存取有序，取出来的顺序就是和存入的顺序保持一致
        LinkedHashMap<String, String> lhmap = new LinkedHashMap<String, String>();

        lhmap.put("JAVA", "Spring");
        lhmap.put("IOS", "ObjectC");
        lhmap.put("JS", "ES7");
        lhmap.put("PHP", "ThinkPHP");
        lhmap.put("C++", "Whatever");
        // ，遍历 第一种方式 foreach
        Set<String> keySet1 = lhmap.keySet();
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        for (String key : keySet1) {
            System.out.println(key + "---" + lhmap.get(key));
        }

        lhmap.clear();
        lhmap.put("PHP", "ThinkPHP");
        lhmap.put("C++", "Whatever");
        lhmap.put("JAVA", "Spring");
        lhmap.put("IOS", "ObjectC");
        lhmap.put("JS", "ES7");

        // ，遍历 第二种方式 迭代器
        Set<Entry<String, String>> entrySet1 = lhmap.entrySet();
        Iterator<Entry<String, String>> it4 = entrySet1.iterator();
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        while (it4.hasNext()) {
            Entry<String, String> entry = it4.next();
            System.out.println(entry.getKey() + "---" + entry.getValue());
        }

    }

}


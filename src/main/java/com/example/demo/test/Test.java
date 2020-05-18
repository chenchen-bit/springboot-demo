package com.example.demo.test;

import java.util.*;

/**
 * 测试、学习类
 * <p>
 * 1.集合框架：
 * Collection 和 Map
 * <p>
 * --Collection：包括两大体系，List 和 Set
 * ---List：有序，元素可重复。通过索引来进行取值
 * ----ArrayList，LinkedList
 * ---Set：无序，元素不可重复
 * ----HashSet，LinkedHashSet，TreeSet
 * <p>
 * --Map：是一个双列集合，其中保存的是键值对，键要求保持唯一性，值可以重复。键值是一一对应的，一个键只能对应一个值
 * ---HashMap，LinkedHashMap，TreeMap
 *
 * @author chenchen
 * @date 2020/05/18
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("---main---");

        demoList();

        demoSet();

        demoMap();
    }

    /**
     * List：集合的的最大目的就是为了存取；List集合的特点就是存取有序，可以存储重复的元素，可以用下标进行元素的操作
     */
    public static void demoList() {
        /*
          ArrayList：底层是使用数组实现，所以查询速度快，增删速度慢
         */
        List<String> arrayList = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            arrayList.add("ArrayList->" + i);
        }
        //第一种遍历方式
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("-----------------");
        //第二种遍历方式
        for (String s : arrayList) {
            System.out.println(s);
        }

        System.out.println("-----------------分割线-----------------");

        /*
          LinkedList：是基于链表结构实现的，所以查询速度慢，增删速度快
         */
        LinkedList<String> linkedList = new LinkedList<>();
        for (int i = 1; i <= 100; i++) {
//            linkedList.add("LinkedList->第" + i + "添加的");
            //每次都添加到第一个位置
            linkedList.addFirst("LinkedList->第" + i + "添加的");
        }
        //打印顺序为先进后出
        for (String s : linkedList) {
            System.out.println(s);
        }

        System.out.println("-----------------分割线-----------------");
    }

    /**
     * Set：元素不重复，存取无序，无下标
     */
    public static void demoSet() {
        /*
          HashSet：哈希表是通过hashCode和equals方法来共同保证元素的唯一性的
         */
        Set<String> hashSet = new HashSet<>();
        hashSet.add("chen");
        hashSet.add("chenbiu");
        hashSet.add("chen");
        hashSet.add("chenbit");
        hashSet.add("chen826");
        hashSet.add("chen996");
        for (String s : hashSet) {
            //只会输出一个chen
            System.out.println(s);
        }

        System.out.println("-----------------分割线-----------------");

        /*
          LinkedHashSet：是基于链表和哈希表共同实现的，所以具有存取有序，元素唯一
         */
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("chen");
        linkedHashSet.add("chenbiu");
        linkedHashSet.add("chen");
        linkedHashSet.add("chenbit");
        linkedHashSet.add("chen826");
        linkedHashSet.add("chen996");
        for (String s : linkedHashSet) {
            //只会输出一个chen，有序的
            System.out.println(s);
        }

        System.out.println("-----------------分割线-----------------");

        /*
          TreeSet：存取无序，元素唯一，可以进行排序（排序是在添加的时候进行排序，自然排序）
         */
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("abc");
        treeSet.add("mhe");
        treeSet.add("yer");
        treeSet.add("dfe");
        treeSet.add("uty");
        treeSet.add("gfd");
        for (String s : treeSet) {
            /*
              abc
              dfe
              gfd
              mhe
              uty
              yer
             */
            System.out.println(s);
        }

        System.out.println("-----------------分割线-----------------");
    }

    /**
     * 键值对
     */
    public static void demoMap() {
        /*
          是基于哈希表结构实现的，存取无序的
         */
        Map<String, String> hashMap = new HashMap<>(16);
        hashMap.put("chen", "重庆");
        hashMap.put("zhang", "冬瓜");
        hashMap.put("li", "吃瓜");
        hashMap.put("chen", "龙泽");
        hashMap.put("tong", "水月");
        Set<Map.Entry<String, String>> entries = hashMap.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> next = iterator.next();
            //只有打印一个chen
            System.out.println(next.getKey() + "：" + next.getValue());
        }

        System.out.println("-----------------分割线-----------------");

        /*
          LinkedHashMap：用法跟HashMap基本一致，它是基于链表和哈希表结构的 所以具有存取有序
         */
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("chen", "重庆");
        linkedHashMap.put("zhang", "冬瓜");
        linkedHashMap.put("li", "吃瓜");
        linkedHashMap.put("chen", "龙泽");
        linkedHashMap.put("tong", "水月");
        for (Map.Entry<String, String> entry : linkedHashMap.entrySet()) {
            //只有打印一个chen，和插入顺序一致
            System.out.println(entry.getKey() + "：" + entry.getValue());
        }

        System.out.println("-----------------分割线-----------------");

        /*
          TreeMap：可排序（排序是在添加的时候进行排序，自然排序）
         */
        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("chen", "重庆");
        treeMap.put("khang", "冬瓜");
        treeMap.put("li", "吃瓜");
        treeMap.put("chen", "龙泽");
        treeMap.put("gong", "水月");
        for (Map.Entry<String, String> entry : treeMap.entrySet()) {
            //只有打印一个chen，并自然排序
            System.out.println(entry.getKey() + "：" + entry.getValue());
        }
    }

}

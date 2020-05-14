package com.example.demo.example;

/**
 * Example示例
 *
 * @author chenchen
 * @date 2020/05/14
 */
public class Example {

    public static void main(String[] args) {

    }

    /**
     * 方法内注释内容为 代码的生产方式
     *
     * @param name name
     */
    public String demo(String name) {
        if (name == null) {
            //name.null
        }
        if (name != null) {
            //name.notnull
        }
        if (name != null) {
            //name.nn
        }
        for (int i = 0; i < 10; i++) {
            //10.for
        }
        boolean exist = true;
        //exist.not
        boolean b = !exist;
        Object o = "chen";
        //o.cast 强转
        String o1 = (String) o;

        //"abc".return
        return "abc";
    }

}

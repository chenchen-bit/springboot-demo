package com.example.demo.custom;

import java.util.EnumSet;

/**
 * 方向枚举
 *
 * @author chenchen
 * @date 2020/05/15
 */
public enum DirectionEnum {

    /**
     * 前
     */
    FRONT("前"),
    /**
     * 后
     */
    BEHIND("后"),
    /**
     * 左
     */
    LEFT("左"),
    /**
     * 右
     */
    RIGHT("右");

    DirectionEnum(String value) {
        this.value = value;
        System.out.println("DirectionEnum构造器->" + value);
    }

    private final String value;

    public String value() {
        return value;
    }

    public static void main(String[] args) {
        //the name of this enum constant
        String name = DirectionEnum.LEFT.name();
        //the ordinal of this enumeration constant
        int ordinal = DirectionEnum.LEFT.ordinal();
        String value = DirectionEnum.BEHIND.value;

        System.out.println(name);
        System.out.println(ordinal);
        System.out.println(value);
    }
}

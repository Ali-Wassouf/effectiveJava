package com.effectivejava.chapterOne.itemOne;

/**
 * @author Ali Wassouf
 */
public class Main {

    public static void main(String... args) {
        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;

        System.out.println(enumSingleton.getValue());
        enumSingleton.setValue(3);
        System.out.println(enumSingleton.getValue());
    }
}

package com.effectivejava.chapterOne.itemOne;

import java.util.EnumSet;

/**
 * @author Ali Wassouf
 */
public class Main {

    public static void main(String... args) {
        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;

        System.out.println(enumSingleton.getValue());
        enumSingleton.setValue(3);
        System.out.println(enumSingleton.getValue());



        User user1 = User.createUsingDefaultValues();
        System.out.println(user1);

        User user2 = User.createUsingDefaultCountryCode("Sam", "Youssef", "Damascus",
                "Kabbas", "C#");
        System.out.println(user2);

        User webUser = User.createWebUserWithDefaultValues();
        System.out.println(webUser);

    }
}

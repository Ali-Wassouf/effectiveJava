package com.effectivejava.chapterOne.itemOne;

/**
 * @author Ali Wassouf
 */
public class WebUser extends User {

    private String userName;
    private String password;


    public WebUser(String userName, String password, String firstName, String lastName, String cityName,
                   String countryCode, String streetName, String bloodType) {

        super(firstName, lastName, cityName, countryCode, streetName, bloodType);

        this.userName = userName;
        this.password = password;

    }

    @Override
    public String toString() {
        return "WebUser{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

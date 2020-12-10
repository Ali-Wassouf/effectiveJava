package com.effectivejava.chapterOne.itemOne;

/**
 * @author Ali Wassouf
 */
public class User {

    private String firstName;
    private String lastName;
    private String cityName;
    private String countryCode;
    private String streetName;
    private String bloodType;


    public User(String firstName, String lastName, String cityName, String countryCode, String streetName, String bloodType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cityName = cityName;
        this.countryCode = countryCode;
        this.streetName = streetName;
        this.bloodType = bloodType;
    }

    public static User createUsingDefaultValues(){
        return new User("Ali", "Wassouf", "Hamburg", "+49",
                "Street", "java");
    }

    public static User createUsingDefaultCountryCode(String firstName, String lastName, String cityName,
                                                     String streetName, String bloodType){
        return new User(firstName, lastName, cityName, "+49", streetName, bloodType);
    }

    public static User createWebUserWithDefaultValues(){
        return new WebUser("aliano", "pass","Ali", "Wassouf", "Hamburg",
                "+49", "Street", "java");
    }

    public String getFirstName() {
        return firstName;
    }

    public User setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public User setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getCityName() {
        return cityName;
    }

    public User setCityName(String cityName) {
        this.cityName = cityName;
        return this;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public User setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    public String getStreetName() {
        return streetName;
    }

    public User setStreetName(String streetName) {
        this.streetName = streetName;
        return this;
    }

    public String getBloodType() {
        return bloodType;
    }

    public User setBloodType(String bloodType) {
        this.bloodType = bloodType;
        return this;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cityName='" + cityName + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", streetName='" + streetName + '\'' +
                ", bloodType='" + bloodType + '\'' +
                '}';
    }
}

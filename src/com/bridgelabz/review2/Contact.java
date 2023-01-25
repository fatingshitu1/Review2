package com.bridgelabz.review2;

public class Contact {
    private String name;
    private String age;
    private String phone;
    private String city;
    private String State;

    public Contact(String name, String age, String phone, String city, String state) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.city = city;
        State = state;

    }

    public Contact() {

    }

    public String getName() {
        return name;
    }

    public void setName(String Shital) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone ) {
        this.phone = phone;
    }
    public String getCity() {
        return city;
    }

    public void setCity(String Wardha) {
        this.city = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String Maharastra) {
        this.State = State;
    }
}

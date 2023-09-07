package net.ummuaqibatulkhair.thymeleaf_blogappcontentstoreslocation.model;

public class Person {
    private String name;
    private String email;
    private  String profession;
    private  String gender;

    public Person(String name, String email, String profession, String gender) {
        this.name = name;
        this.email = email;
        this.profession = profession;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
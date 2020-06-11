package com.example.test2018131382.bean;

public class UserBean {
    private int id;
    private String name;
    private String password;
    private String role;

    public int getld(){
        return id;
    }
    public void setld(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password =password;
    }

    public String getRole() {
        return role;
    }
    @Override
    public String toString() {
        return "UserBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
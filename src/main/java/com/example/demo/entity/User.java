package com.example.demo.entity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xulin
 */
@SpringBootApplication
public class User {
    String name;
    int password;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int password(){
        return password;
    }
    public void setPassword(int password){
        this.password = password;
    }
    @Override
    public String toString(){
        return "user{name='"+name+"\',"+"password="+password+"}";
    }
}

package com.example.ivanovnv.gson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by IvanovNV on 19.02.2018.
 */

public class Human {
    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("age")
    @Expose
    private int age;

    @SerializedName("kids")
    @Expose
    private List<Human> kids = null;

    public String getName(){return name;}
    public void setName(String name) {this.name=name;}

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Human> getKids() {
        return kids;
    }

    public void setKids(List<Human> kids) {
        this.kids = kids;
    }
}

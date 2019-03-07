package com.example.android.inclassassignment07_yuy;

import java.io.Serializable;

public class MarvelHero implements Serializable {
    String name;
    String gender;
    boolean isAlive;

    public MarvelHero(String name,String gender,boolean isAlive) {
        this.name = name;
        this.gender = gender;
        this.isAlive = isAlive;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}

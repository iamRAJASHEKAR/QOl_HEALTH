package com.example.yeswanth.recyclerview_advanced;

/**
 * Created by mypc on 2/1/2018.
 */

public class ModelClass {

    String name;
    int image;

    public ModelClass(String name, int image) {
        this.name = name;
        this.image = image;
    }

    public ModelClass() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }


}

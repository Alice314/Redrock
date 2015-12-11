package com.wusui.redrock;

/**
 * Created by fg on 2015/12/11.
 */
public class Student {
    private String name;
    private int imageId;

    public Student(String text,int imageId ){
        this.name = text;
        this.imageId = imageId;
    }
    public String getText(){
        return name;
    }

    public int getImageId() {
        return imageId;
    }
}

package com.example.recyclerviewtest;

/**
 * Created by jingluyuan on 3/21/18.
 */

public class Sneakers {
    private String name;
    private int ImageId;

    public Sneakers(String name, int imageId)
    {
        this.name = name;
        this.ImageId = imageId;
    }

    public String getName()
    {
        return name;
    }

    public int getImageId()
    {
        return ImageId;
    }
}

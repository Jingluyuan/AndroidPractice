package example.com.materialtest;

/**
 * Created by jingluyuan on 6/9/18.
 */

public class Sneaker {
    private String name;
    private int imagId;
    public Sneaker(String name,int imageId)
    {
        this.name = name;
        this.imagId = imageId;
    }
    public String getName(){
        return name;
    }
    public int getImagId(){
        return imagId;
    }
}

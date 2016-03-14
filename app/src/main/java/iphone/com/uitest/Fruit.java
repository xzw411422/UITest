package iphone.com.uitest;

/**
 * Created by xzw12 on  0012.
 */
public class Fruit {
    private String nameId;
    private int imageId;
    private int Id;

    public Fruit(String nameId,int imageId,int Id){
        this.imageId = imageId;
        this.nameId = nameId;
        this.Id = Id;
    }
    public String getName(){
        return nameId;
    }
    public int getImageId(){
        return imageId;
    }
    public int getId(){
        return Id;
    }

}

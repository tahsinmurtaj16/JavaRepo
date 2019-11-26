import java.util.Date;

public class House extends Object implements Cloneable , Comparable<House> {
    private int id;
    private double area;
    private java.util.Date whenBuilt;

    public House(int id,double area)
    {
        this.id = id;
        this.area = area;
        whenBuilt = new java.util.Date();
    }

    public int getId() {
        return id;
    }

    public double getArea() {
        return area;
    }

    public Date getWhenBuilt() {
        return whenBuilt;
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
       // return super.clone(); for this one house1.whenBuilt == house2.whenBuilt is true
        //To perform deep copy on a House object , clone() method is replaced
        //perform a shallow copy
        House houseClone = (House)super.clone();
        // Deep copy on whenBuilt
        houseClone.whenBuilt = (java.util.Date)(whenBuilt.clone()); /*for this one house1.whenBuilt == house2.whenBuilt will be
        false , house1 and house2 contain two different date objects.*/
        return houseClone;
    }
    @Override
    public int compareTo(House o)
    {
        return area > o.area ? 1 : (area < o.area ? -1 : 0);
    }
}

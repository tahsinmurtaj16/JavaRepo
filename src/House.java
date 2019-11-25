import java.util.Date;

public class House implements Cloneable , Comparable<House> {
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
    public int compareTo(House o)
    {
        return area > o.area ? 1 : (area < o.area ? -1 : 0);
    }
}

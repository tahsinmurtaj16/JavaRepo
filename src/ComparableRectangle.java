//package java.lang.Comparable;
 //interface Comparable<ComparableRectangle>{
    //public int compareTo(ComparableRectangle o);
//}
public class ComparableRectangle extends RectangleFromSimpleGeometricObject
        implements Comparable<ComparableRectangle> {
    /** Construct a ComparableRectangle with specified properties */
    public ComparableRectangle(double width, double height) {
        super(width, height);
    }
    @Override // Implement the compareTo method defined in Comparable
    public int compareTo(ComparableRectangle o) {
        return getArea() > o.getArea() ? 1:(getArea()<o.getArea()?-1:0);
    }
    @Override
    public boolean equals(Object o)
    {
        return getArea() == (((ComparableRectangle)o).getArea());
    }
    @Override // Implement the toString method in GeometricObject
    public String toString() {
        return super.toString() + " Area: " + getArea();
    }
}
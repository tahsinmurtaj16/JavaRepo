public class PolymorphismDemo {
    public static void main(String[] args)
    {
        displayObject(new CircleFromSimpleGeometricObject(1,"Red",false));
       // displayObject(new RectangleFromSimpleGeometricObject(1,1,"black",true));
    }
    public static void displayObject(SimpleGeometricObject object)
    {
        System.out.println("Created on "+object.getDateCreated()+" .color is "+object.getColor());
    }
}
